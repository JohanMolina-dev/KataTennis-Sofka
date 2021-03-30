
public class TennisGame1 implements TennisGame {
    
    private int puntajeP1 = 0;
    private int puntajeP2 = 0;

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            puntajeP1 += 1;
        else
            puntajeP2 += 1;
    }

    public String getScore() {
        String score = "";
        if (equalPoints(puntajeP1, puntajeP2))
        {
            score = getEquals();
        }
        else if (deuce())
        {
            score = greaterFour();
        }
        else
        {
            score = partidoNormal(score, puntajeP1);
            score+="-";
            score = partidoNormal(score, puntajeP2);
            }
        return score;
        }

    private boolean deuce() {
        return puntajeP1 >= 4 || puntajeP2 >= 4;
    }

    private boolean equalPoints(int puntajeP1, int puntajeP2) {
        return puntajeP1 == puntajeP2;
    }

    private String greaterFour() {
        String score;
        int minusResult = puntajeP1 - puntajeP2;
        if (equalPoints(minusResult, 1)) score ="Advantage player1";
        else if (equalPoints(minusResult, -1)) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private String getEquals() {
        String score;
        switch (puntajeP1)
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


    private String partidoNormal(String score, int marks) {
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
            default:
                return score;


        }
        return score;
    }
}
