package Game;

import Gameobjects.Ships.Ship;
import Gameobjects.Player.Player;
import IO.IO;
import java.util.ArrayList;

public class Game {
    
    private ArrayList<Player> playerList;

    private ArrayList<Ship> shipList;
    
    private String input;

    private String coordinateInput;

    private boolean shipOrientation;
    
    private Settings currentGameSettings;

    private int amountOfPlayer;

    private boolean error;
    
    

    public Game(Settings settings) {
        this.currentGameSettings = settings;
        IO.println("Willkommen beim Spiel Schiffeversenken!!!");
        buildPlayerArray();
        
    }
   private void buildPlayerArray() {
        this.playerList = new ArrayList<>();
        int playerNumber = 1;
        for (int i = 1; i <= currentGameSettings.getAmountOfPlayer(); i++) {
            IO.print("Spieler " + (i) + " - Geben Sie ihren Namen ein: ");
            String name = IO.readString();//Einlesen des Spielernamens
            Player player = new Player(currentGameSettings,name, playerNumber);
            playerList.add(player);
            playerNumber++;

        }
    
    
}
}
