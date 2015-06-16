package Game;

import Gameobjects.Ships.Ship;
import Gameobjects.Player.Player;
import IO.IO;
import java.util.ArrayList;
import Helper.Helper;

public class Game {

    private ArrayList<Player> playerList;

    private ArrayList<Ship> shipList;

    private int input;

    private String coordinateInput;

    private boolean shipOrientation;

    private Settings currentGameSettings;

    private int amountOfPlayer;

    private boolean error;

    public Game(Settings settings) {
        this.currentGameSettings = settings;
        IO.println("Willkommen beim Spiel Schiffeversenken!!!");
        buildPlayerArray();
        placeAllShips();

    }

    private void buildPlayerArray() {
        this.playerList = new ArrayList<>();
        int playerNumber = 1;
        for (int i = 1; i <= currentGameSettings.getAmountOfPlayer(); i++) {
            IO.print("Spieler " + (i) + " - Geben Sie ihren Namen ein: ");
            String name = IO.readString();//Einlesen des Spielernamens
            Player player = new Player(playerList, currentGameSettings, name, playerNumber);
            playerList.add(player);
            playerNumber++;

        }

    }

    private void placeAllShips() {
        error = false;

        for (Player player : playerList) {
            IO.println("Spieler " + player.getName() + " Sie können nun folgende Schiffe setzen: ");
            player.printShipList();
            IO.println("Welches Schiff möchten Sie setzen: ");
            for (Ship ship : player.getShips()) {

                do {
                    input = IO.readInt();

                    if (input == ship.getNumber()) {
                        Helper.checkOrientation();
                        if (ship.equals(player.getShips().get(input))) {
                        player.getShips().remove(input);
                        player.printShipList();
                        }
                        error = false;
                    } else {
                        IO.println("Falsche Eingabe, bitte erneut eingeben: ");
                        error = true;

                    }

                } while (error);
            }

        }
    }
}
