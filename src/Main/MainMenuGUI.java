/*
 * To change this license headerL, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Multimedia.BackgroundImagePanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Game.*;  

/**
 *
 * @author Tobias
 */
public class MainMenuGUI extends JFrame implements ActionListener {

    
    JPanel backGroundP;
    Box buttonBox;
    JLabel headerL;
    JPanel menuP;
    JPanel headerP;
    JButton[] menuButtons = {new JButton("Neues Spiel"), new JButton("Spiel Laden"), new JButton("Einstellungen"),
        new JButton("Anleitung"), new JButton("Spiel Verlassen")};

    final Dimension MAXBUTTONSIZE = menuButtons[4].getMaximumSize();

    public  MainMenuGUI() {
        setTitle("Battleship");
        backGroundP = new BackgroundImagePanel("G:\\hs\\Prog2\\Battleship_Alpha2\\Images\\background.jpg");
//        backGroundP.setLayout(new CardLayout());
        
        headerL = new JLabel("Schiffeversenken Alpha_2");
        headerL.setFont(new Font("Serif", 25, 25));
        headerP = new JPanel();
        headerP.add(headerL);
        headerP.setPreferredSize(new Dimension(700, 50));
        headerP.setOpaque(false);

        buttonBox = new Box(BoxLayout.Y_AXIS);
        buttonBox.add(Box.createRigidArea(new Dimension(1, 35)));
        for (int i = 0; i < menuButtons.length; i++) {
            buttonBox.add(menuButtons[i]);
            buttonBox.add(Box.createRigidArea(new Dimension(0, 10)));
            menuButtons[i].setMaximumSize(MAXBUTTONSIZE);
            menuButtons[i].setBackground(Color.white);
            menuButtons[i].setForeground(Color.black);
            menuButtons[i].setFont(new Font("Serif", 10, 13));
            menuButtons[i].setActionCommand("" + i);
            menuButtons[i].addActionListener(this);

        }
        
        menuP = new JPanel();
        menuP.setLayout(new CardLayout());
        menuP.add(buttonBox);
        menuP.setOpaque(false);

        backGroundP.add(headerP);
        backGroundP.add(menuP);
        add(backGroundP);

        setVisible(true);
        setBounds(450, 50, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        int input = Integer.parseInt(command);

        switch (input) {
            case 0:
                GameGui gg = new GameGui();
                break;
            case 1:
                break;
            case 2:
                SettingsGui settingsGui = new SettingsGui();
                headerP.setVisible(false);
                menuP.setVisible(false);
                backGroundP.add(settingsGui);
                
//                repaint();
                
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
    

    public void setMenuP(JPanel menuP) {
        this.menuP = menuP;
    }

    public void setHeaderP(JPanel headerP) {
        this.headerP = headerP;
    }

}
