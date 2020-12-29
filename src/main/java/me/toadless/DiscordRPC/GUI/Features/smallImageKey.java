package me.toadless.DiscordRPC.GUI.Features;

import me.toadless.DiscordRPC.GUI.openWindow;

import javax.swing.*;

public class smallImageKey {
    public static JLabel SmallImageKey;
    public static JTextField smallImageKey;
    public smallImageKey() {
        SmallImageKey = new JLabel("Small Image Key");
        smallImageKey = new JTextField(20);
        smallImageKey.setBounds(100, 20 ,165, 25);
        openWindow.panel.add(SmallImageKey);
        openWindow.panel.add(smallImageKey);
    }
}
