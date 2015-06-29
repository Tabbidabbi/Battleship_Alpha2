/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.*;

/**
 *
 * @author Tobias
 */
public class GameGui extends JFrame implements ActionListener{

    public GameGui() {
        setTitle("Willkommen beim Schiffeversenken");
        setSize(1024, 768);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
