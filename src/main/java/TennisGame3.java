
public class TennisGame3 implements TennisGame {

    private int puntajeP2;
    private int puntajeP1;
    private final String jugador1;
    private final String jugador2;
    public static final String[] LIST_RESULTADO = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame3(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public String getScore() {
        if (gapScore()) {
            return LIST_RESULTADO[puntajeP1] + "-" + LIST_RESULTADO[puntajeP2];
        }
        else if(puntajeP1 == puntajeP2){
            return deadHead();
        }

            return headScore();

    }

    private boolean gapScore() {
        return puntajeP1 < 4 && puntajeP2 < 4 && puntajeP1 != puntajeP2;
    }

    private String deadHead() {

        return puntajeP1 < 3 && puntajeP2 < 3 ? LIST_RESULTADO[puntajeP1] + "-All" : "Deuce";
    }
    private String headScore() {
        return (Math.abs(puntajeP1 - puntajeP2) == 1) ? "Advantage " + selectPlayerHead() : "Win for " + selectPlayerHead();
    }

    private String selectPlayerHead() {
        return puntajeP1 > puntajeP2 ? jugador1 : jugador2;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1") )
            this.puntajeP1 ++;
        else
            this.puntajeP2 ++;
        
    }

}
