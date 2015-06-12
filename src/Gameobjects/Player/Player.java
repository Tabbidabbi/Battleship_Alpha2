package Gameobjects.Player;

import Game.Settings;
import Gameobjects.Playfield.Playfield;
import Gameobjects.Ships.*;
import java.util.ArrayList;

public class Player {

    private int number;

    private String name;

    private ArrayList<Ship> ships;

//    Settings settings = new Settings();
    private Playfield playfield;

    private Playfield opponentField;

    private boolean lost;

    private boolean isAI;

    public Player(Settings currentGameSettings, String name, int number) {
        this.name = name;
        this.number = number;
        buildShipArray(currentGameSettings);
        playfield = new Playfield(currentGameSettings.getPlayfieldSize(),currentGameSettings.getPlayfieldSize());
        playfield.printPlayField();
        opponentField = new Playfield(currentGameSettings.getPlayfieldSize(),currentGameSettings.getPlayfieldSize());
    }
    
    private void buildShipArray(Settings cSettings) {
         ships = new ArrayList<>();
        int shipNumber = 1;
        for (int i = 1; i <= cSettings.getAmountOfCorvette(); i++) {
            Ship ship = new Destroyer(shipNumber);
            ships.add(ship);
            shipNumber++;
        }
        for (int i = 1; i <= cSettings.getAmountOfFrigate(); i++) {
            Ship ship = new Frigate(shipNumber);
            ships.add(ship);
            shipNumber++;

        }
        for (int i = 1; i <= cSettings.getAmountOfCorvette(); i++) {
            Ship ship = new Corvette(shipNumber);
            ships.add(ship);
            shipNumber++;

        }
        for (int i = 1; i <= cSettings.getAmountOfSubmarine(); i++) {
            Ship ship = new Submarine(shipNumber);
            ships.add(ship);
            shipNumber++;

        }
    }
}
