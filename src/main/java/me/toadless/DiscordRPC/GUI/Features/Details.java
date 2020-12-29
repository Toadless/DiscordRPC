package me.toadless.DiscordRPC.GUI.Features;

import me.toadless.DiscordRPC.GUI.openWindow;

import javax.swing.*;

public class Details {
    public static JLabel details;
    public static JTextField Details;
    public Details() {
        details = new JLabel("Details");
        Details = new JTextField();
        Details.setBounds(100, 20 ,165, 25);

        openWindow.panel.add(details);

        openWindow.panel.add(Details);
    }
}
