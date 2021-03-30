import java.util.List;

import static java.util.Arrays.asList;

public class TennisGame2 implements TennisGame {

    private int puntajeP1 = 0;
    private int puntajeP2 = 0;
    private static final List<String> LIST_RESULTADOS = asList("Love", "Fifteen", "Thirty", "Forty", "Deuce");

    private final String jugador1;
    private final String jugador2;

    public TennisGame2(String player1Name, String player2Name) {
        this.jugador1 = player1Name;
        this.jugador2 = player2Name;
    }

    public String getScore() {

        if (puntajeP1 == puntajeP2) return deadHead();
        else if (puntajeP2 < 4 && puntajeP1 < 4) return gapScore();
        return headScore();

    }
    //Extracción de Método
    private String headScore() {
        return Math.abs( puntajeP1 - puntajeP2) ==1 ? "Advantage " + selectPlayerHead() : "Win for "+ selectPlayerHead();

    }
    //Extracción de Método
    private String selectPlayerHead() {
        String selectPlayer;
        if (puntajeP1 > puntajeP2) selectPlayer = jugador1;
        else selectPlayer = jugador2;
        return selectPlayer;
    }

    private String gapScore() {
        return LIST_RESULTADOS.get(puntajeP1) + "-" + LIST_RESULTADOS.get(puntajeP2);
    }

    private String deadHead() {
        if (puntajeP1 < 3) return LIST_RESULTADOS.get(puntajeP1) + "-All";
        return "Deuce";
    }

    public void wonPoint(String player) {
        if (player.equals("player1") )
            puntajeP1++;
        else
            puntajeP2++;
    }
}