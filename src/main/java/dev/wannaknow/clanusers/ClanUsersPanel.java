package dev.wannaknow.clanusers;

import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ClanUsersPanel extends PluginPanel {

    private ClanUsersPlugin plugin;

    ClanUsersPanel(ClanUsersPlugin plugin) {

        getParent().setLayout(new BorderLayout());
        getParent().add(this, BorderLayout.NORTH);



        JButton rankedFCbutton = new JButton("Copy ranked FC usernames");
        rankedFCbutton.addActionListener(l -> {
            plugin.copyRankedFriendsChatUsernames();
        });

        JButton allFCbutton = new JButton("Copy all FC usernames");
        allFCbutton.addActionListener(l -> {
            plugin.copyFriendsChatUsernames();
        });

        JButton allCCbutton = new JButton("Copy all CC usernames");
        allCCbutton.addActionListener(l -> {
            plugin.copyClanChatUsernames();
        });

        add(rankedFCbutton);
        add(allFCbutton);
        add(allCCbutton);
    }
}
