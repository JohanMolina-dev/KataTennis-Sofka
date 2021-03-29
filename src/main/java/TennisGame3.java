
public class TennisGame3 implements TennisGame {
    
    private int puntajeP2;
    private int puntajeP1;
    private String jugador1;
    private String jugador2;

    public TennisGame3(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public String getScore() {
        String s;
        if (puntajeP1 < 4 && puntajeP2 < 4 && !(puntajeP1 + puntajeP2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            s = p[puntajeP1];
            return (puntajeP1 == puntajeP2) ? s + "-All" : s + "-" + p[puntajeP2];
        } else {
            if (puntajeP1 == puntajeP2)
                return "Deuce";
            s = puntajeP1 > puntajeP2 ? jugador1 : jugador2;
            return ((puntajeP1 - puntajeP2)*(puntajeP1 - puntajeP2) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }
    
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.puntajeP1 += 1;
        else
            this.puntajeP2 += 1;
        
    }

}
