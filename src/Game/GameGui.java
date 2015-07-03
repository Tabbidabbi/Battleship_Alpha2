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
import Gameobjects.Playfield.*;

/**
 *
 * @author Tobias
 */
public class GameGui extends JPanel {

    GridBagLayout gridBagLayout;
    GridBagConstraints gbc;

    PlayerPlayfieldGui playerPlayFieldPanel;

    JPanel playerListPanel;

    JPanel textOutputPanel;

    JPanel shipListPanel;

    JPanel buttonPanel;

    public GameGui() {
        setPreferredSize(new Dimension(1024, 768));
        setOpaque(false);
        gridBagLayout = new GridBagLayout();
        gbc = new GridBagConstraints();
        setLayout(gridBagLayout);

        playerPlayFieldPanel = new PlayerPlayfieldGui();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(playerPlayFieldPanel, gbc);

        playerListPanel = new JPanel();
        playerListPanel.setBackground(Color.red);
        playerListPanel.setPreferredSize(new Dimension(150, 250));

        textOutputPanel = new JPanel();
        textOutputPanel.setBackground(Color.yellow);
        textOutputPanel.setPreferredSize(new Dimension(450, 250));

        shipListPanel = new JPanel();
        shipListPanel.setBackground(Color.blue);
        shipListPanel.setPreferredSize(new Dimension(150, 250));


        add(playerPlayFieldPanel);
        add(playerListPanel);
        add(textOutputPanel);
        add(shipListPanel);

        setVisible(true);
    }

}
