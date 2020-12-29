package me.toadless.DiscordRPC.GUI.Features;

import me.toadless.DiscordRPC.GUI.openWindow;

import javax.swing.*;

public class largeImageKey {
    public static JLabel LargeImageKey;
    public static JTextField largeImageKey;
    public largeImageKey() {
        LargeImageKey = new JLabel("Large Image Key");
        largeImageKey = new JTextField(20);
        largeImageKey.setBounds(100, 20 ,165, 25);
        openWindow.panel.add(LargeImageKey);
        openWindow.panel.add(largeImageKey);
    }
}
