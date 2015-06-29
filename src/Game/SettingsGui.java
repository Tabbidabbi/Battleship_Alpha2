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
public class SettingsGui extends JPanel implements ActionListener {
    
    JLabel headerL;
    JPanel headerP;
    
    JButton backButton, resetSettingsButton, confirmButton;
    JPanel buttonP;
    
    JTextField[] textFields = {new JTextField(2), new JTextField(2), new JTextField(2), 
                               new JTextField(2), new JTextField(2), new JTextField(2),
                               new JTextField(2)};
    JLabel[] textLabel = {new JLabel("Anzahl Spieler ändern:"), new JLabel("Anzahl Ki-Spieler ändern:"), new JLabel("Anzahl der Zerstörer ändern:"),
                          new JLabel("Anzahl der Fregatten ändern:"), new JLabel("Anzahl der Korvetten ändern:"), new JLabel("Anzahl der U-Boote ändern:"),
                          new JLabel("Spielfeldgröße ändern:")};
    JPanel[] componentP = {new JPanel(), new JPanel(), new JPanel(), new JPanel(), new JPanel(), new JPanel(), new JPanel()} ;
    
    JPanel textFieldP;
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
        
        textFieldP = new JPanel();
        textFieldP.setLayout(new BoxLayout(textFieldP, BoxLayout.Y_AXIS));
        for (int i = 0; i < componentP.length; i++) {
            componentP[i].add(textLabel[i]);
            componentP[i].add(textFields[i]);
            textLabel[i].setPreferredSize(new Dimension(200, 35));
            textLabel[i].setFont(new Font("Serif", 10, 15));
            textLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
            textFieldP.add(componentP[i]);
            
        }
        
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
        backPanel.add(textFieldP);
        backPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        backPanel.add(buttonP);

        
        add(backPanel);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String input = e.getActionCommand();
        
        if (input.equals("back")) {
            
        }
        
        
        
        
    }
    
}
