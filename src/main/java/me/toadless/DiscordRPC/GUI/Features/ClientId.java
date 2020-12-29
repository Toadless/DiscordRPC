package me.toadless.DiscordRPC.GUI.Features;

import javax.swing.*;
import me.toadless.DiscordRPC.GUI.openWindow;

public class ClientId {
    public static JLabel clientId;
    public static JTextField ClientId;
    public ClientId() {
        clientId = new JLabel("Application Client Id");
        ClientId = new JTextField();
        ClientId.setBounds(100, 20 ,165, 25);

        openWindow.panel.add(clientId);

        openWindow.panel.add(ClientId);
    }
}
