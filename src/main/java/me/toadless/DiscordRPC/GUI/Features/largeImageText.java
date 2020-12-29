package me.toadless.DiscordRPC.GUI.Features;

import me.toadless.DiscordRPC.GUI.openWindow;

import javax.swing.*;

public class largeImageText {
    public static JLabel LargeImageText;
    public static JTextField largeImageText;
    public largeImageText() {
        LargeImageText = new JLabel("Large Image Text");
        largeImageText = new JTextField(20);
        largeImageText.setBounds(100, 20 ,165, 25);
        openWindow.panel.add(LargeImageText);
        openWindow.panel.add(largeImageText);
    }
}
