package me.toadless.DiscordRPC.GUI.Features;

import me.toadless.DiscordRPC.GUI.openWindow;

import javax.swing.*;

public class State {
    public static JLabel state;
    public static JTextField State;
    public State() {
        state = new JLabel("State");
        State = new JTextField();
        State.setBounds(100, 20 ,165, 25);

        openWindow.panel.add(state);

        openWindow.panel.add(State);
    }
}
