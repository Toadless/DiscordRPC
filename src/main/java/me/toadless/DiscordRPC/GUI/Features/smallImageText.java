package me.toadless.DiscordRPC.GUI.Features;

import me.toadless.DiscordRPC.GUI.openWindow;

import javax.swing.*;

public class smallImageText {
    public static JLabel SmallImageText;
    public static JTextField smallImageText;
    public smallImageText() {
        SmallImageText = new JLabel("Large Image Text");
        smallImageText = new JTextField(20);
        smallImageText.setBounds(100, 20 ,165, 25);
        openWindow.panel.add(SmallImageText);
        openWindow.panel.add(smallImageText);
    }
}
