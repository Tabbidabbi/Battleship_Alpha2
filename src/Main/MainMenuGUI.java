/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Multimedia.BackgroundImage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Tobias
 */
public class MainMenuGUI extends JFrame implements ActionListener {

    BackgroundImage bImage;
    Box buttonBox;
    JLabel header;
    JPanel menuP;
    JPanel headerP;
    JButton[] menuButtons = {new JButton("Neues Spiel"), new JButton("Spiel Laden"), new JButton("Einstellungen"),
        new JButton("Anleitung"), new JButton("Spiel Verlassen")};

//    JButton bNewGame = new JButton("Neues Spiel");
//    JButton bLoadGame = new JButton("Spiel Laden");
//    JButton bGameSettings = new JButton("Einstellungen");
//    JButton bInstructions = new JButton("Anleitung");
//    JButton bExitGame = new JButton("Spiel Verlassen");
    Dimension di = menuButtons[4].getMaximumSize();

    public MainMenuGUI() {
        setTitle("Battleship");
        setContentPane(bImage = new BackgroundImage("G:\\hs\\Prog2\\Battleship_Alpha2\\Images\\background.jpg"));

        header = new JLabel("Schiffeversenken Alpha_2");
        header.setFont(new Font("Serif", 25, 25));
        headerP = new JPanel();
        headerP.add(header);
        headerP.setPreferredSize(new Dimension(700, 50));
        headerP.setOpaque(false);

        buttonBox = new Box(BoxLayout.Y_AXIS);
        buttonBox.add(Box.createRigidArea(new Dimension(1, 35)));
        for (int i = 0; i < menuButtons.length; i++) {
            buttonBox.add(menuButtons[i]);
            buttonBox.add(Box.createRigidArea(new Dimension(0, 10)));
            menuButtons[i].setMaximumSize(di);
            menuButtons[i].setBackground(Color.white);
            menuButtons[i].setForeground(Color.black);
            menuButtons[i].setFont(new Font("Serif",10,13));
            menuButtons[i].setActionCommand("" + i);
            menuButtons[i].addActionListener(this);

        }
//        bNewGame.setMaximumSize(di);
//        bNewGame.setBackground(Color.lightGray);
//        bLoadGame.setMaximumSize(di);
//        bGameSettings.setMaximumSize(di);
//        bInstructions.setMaximumSize(di);
//
//        buttonBox.add(bNewGame);
//        buttonBox.add(Box.createRigidArea(new Dimension(0, 10)));
//        buttonBox.add(bLoadGame);
//        buttonBox.add(Box.createRigidArea(new Dimension(0, 10)));
//        buttonBox.add(bGameSettings);
//        buttonBox.add(Box.createRigidArea(new Dimension(0, 10)));
//        buttonBox.add(bInstructions);
//        buttonBox.add(Box.createRigidArea(new Dimension(0, 10)));
//        buttonBox.add(bExitGame);

        bImage.add(headerP);
        bImage.add(buttonBox);

        setBounds(450, 50, 800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String command = e.getActionCommand();
        int input = Integer.parseInt(command);
        
        
        switch(input) {
            case 0:
                
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.exit(0);
                break;
                
        }
    }

    public static void main(String[] args) {
        MainMenuGUI gUI = new MainMenuGUI();
    }

}
