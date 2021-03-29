
public class TennisGame1 implements TennisGame {
    
    private int marks1 = 0;
    private int marks2 = 0;

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            marks1 += 1;
        else
            marks2 += 1;
    }

    public String getScore() {
        String score = "";
        if (marks1 == marks2)
        {
            score = getEquals();
        }
        else if (marks1>=4 || marks2>=4)
        {
            score = greaterFour();
        }
        else
        {
            score = factor1(score, marks1);
            score+="-";
            score = factor1(score, marks2);
            }
        return score;
        }

    private String greaterFour() {
        String score;
        int minusResult = marks1-marks2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private String getEquals() {
        String score;
        switch (marks1)
        {
            case 0:
                    score = "Love-All";
                break;
            case 1:
                    score = "Fifteen-All";
                break;
            case 2:
                    score = "Thirty-All";
                break;
            default:
                    score = "Deuce";
                break;

        }
        return score;
    }


    private String factor1(String score, int marks) {
        switch(marks)
        {
            case 0:
                score +="Love";
                break;
            case 1:
                score +="Fifteen";
                break;
            case 2:
                score +="Thirty";
                break;
            case 3:
                score +="Forty";
                break;


        }
        return score;
    }
}
