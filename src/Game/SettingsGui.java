/*
 * To change this license headerL, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Main.*;

/**
 *
 * @author Tobias
 */
public class SettingsGui extends JFrame implements ActionListener {
    
    JLabel headerL;
    JPanel headerP;
    
    JComboBox<Integer>ammountPlayerComboBox = new JComboBox<>();
    JLabel playerComboBoxLabel = new JLabel("Anzahl der Spieler");
    JPanel playerComboBoxP;
    
    
    
    JLabel[]ammountPlayersLabel = {new JLabel("Spieler 1:"), new JLabel("Spieler 2:"),new JLabel("Spieler 3:"),
                                   new JLabel("Spieler 4:"),new JLabel("Spieler 5:"),new JLabel("Spieler 6:")}; 
    JTextField[]playerTextFields = new JTextField[6];
    JCheckBox[]kiCheckboxes = new JCheckBox[6];
    JPanel[]singlePlayerP = new JPanel[6];
    JPanel playerP;
    
    
    JPanel buttonP;
    JButton backButton, resetSettingsButton, confirmButton;
    
    
    
    
    JTextField[]shipTextFields = new JTextField[4];
    JLabel[] shipLabel = {new JLabel("Anzahl der Zerstörer:"),
                          new JLabel("Anzahl der Fregatten:"), new JLabel("Anzahl der Korvetten:"),
                          new JLabel("Anzahl der U-Boote:")};
    JPanel[] singleShipP = new JPanel[4];
    
    JPanel shipFieldsPanel;
    JPanel categoriePanel; 
    JPanel backPanel;
    
    
    public SettingsGui() {
        setPreferredSize(new Dimension(640, 480));
        setLayout(new FlowLayout());
        headerL = new JLabel("Einstellungen");
        headerL.setFont(new Font("Serif", 25, 25));
        headerP = new JPanel();
        headerP.add(headerL);
        headerP.setPreferredSize(new Dimension(700, 50));
        headerP.setOpaque(false);
        
        playerComboBoxP = new JPanel();
        for (int i = 2; i <= 6;i++){
            ammountPlayerComboBox.addItem(i);
            
        }
        playerComboBoxP.add(playerComboBoxLabel);
        playerComboBoxP.add(ammountPlayerComboBox);
        
        playerP = new JPanel();
        playerP.setLayout(new BoxLayout(playerP, BoxLayout.Y_AXIS));
        for (int i = 0; i < playerTextFields.length;i++) {
            playerTextFields[i] = new JTextField("Spieler" + (i + 1), 10);
            singlePlayerP[i] = new JPanel();
            kiCheckboxes[i] = new JCheckBox("Is KI");
            singlePlayerP[i].add(ammountPlayersLabel[i]);
            singlePlayerP[i].add(playerTextFields[i]);
            singlePlayerP[i].add(kiCheckboxes[i]);
            playerP.add(singlePlayerP[i]);
            
        }
        
      shipFieldsPanel= new JPanel();
        shipFieldsPanel.setLayout(new BoxLayout(shipFieldsPanel, BoxLayout.Y_AXIS));
        for (int i = 0; i < 4; i++) {
            shipTextFields[i] = new JTextField(2);
            singleShipP[i] = new JPanel();
            singleShipP[i].add(shipLabel[i]);
            singleShipP[i].add(shipTextFields[i]);
            shipFieldsPanel.add(singleShipP[i]);
            shipLabel[i].setFont(new Font("Serif", 10, 15));
            shipLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
            
        }
        categoriePanel = new JPanel();
        categoriePanel.setLayout(new BoxLayout(categoriePanel, BoxLayout.X_AXIS));
        categoriePanel.add(playerComboBoxP);
        categoriePanel.add(playerP);
        categoriePanel.add(shipFieldsPanel);
        
        backButton = new JButton("Zurück");
        backButton.setActionCommand("back");
        backButton.addActionListener(this);
        resetSettingsButton = new JButton("Zurücksetzen");
        resetSettingsButton.setActionCommand("reset");
        resetSettingsButton.addActionListener(this);
        confirmButton = new JButton("Bestätigen");
        confirmButton.setActionCommand("confirm");
        confirmButton.addActionListener(this);
        
        buttonP = new JPanel();
        buttonP.setLayout(new BoxLayout(buttonP, BoxLayout.X_AXIS));
        buttonP.add(Box.createHorizontalGlue());
        buttonP.add(backButton);
        buttonP.add(Box.createHorizontalGlue());
        buttonP.add(resetSettingsButton);
        buttonP.add(Box.createHorizontalGlue());
        buttonP.add(confirmButton);
        buttonP.add(Box.createHorizontalGlue());
        
        

        
        backPanel = new JPanel();
        backPanel.setLayout(new BoxLayout(backPanel, BoxLayout.Y_AXIS));
        backPanel.add(headerP);
        backPanel.add(categoriePanel);
//        backPanel.add(textFieldP);
        backPanel.add(Box.createRigidArea(new Dimension(0, 80)));
        backPanel.add(buttonP);

        
        add(backPanel);
        setSize(800, 600);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String input = e.getActionCommand();
        
        if (input.equals("back")) {
            setBackground(Color.yellow);
        }
        
        
        
        
    }
    
}
