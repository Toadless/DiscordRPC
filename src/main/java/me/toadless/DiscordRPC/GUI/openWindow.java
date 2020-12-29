package me.toadless.DiscordRPC.GUI;

import me.toadless.DiscordRPC.GUI.Features.*;
import me.toadless.DiscordRPC.RichPresence.RichPresence;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class openWindow implements ActionListener {
    public static JFrame frame;
    public static JPanel panel;
    public void OpenGUI() {
       frame = new JFrame() ;
       panel = new JPanel();
       panel.setBorder(BorderFactory.createEmptyBorder());
       panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
       panel.setLayout(new GridLayout(0 ,1));

       //Page title
       JLabel title = new JLabel("Discord RPC");
       title.setFont(new Font("Courier", Font.BOLD,50));
       panel.add(title);

       //Adding all features
        new loadFeatures();

       //Setting Icon
       ImageIcon image = new ImageIcon("src/logo.png");
       frame.setIconImage(image.getImage());

       //Start rpc button
       JButton button = new JButton("Start RPC");
       button.addActionListener(this);
       panel.add(button);

       frame.add(panel, BorderLayout.CENTER);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("Discord RPC");
       frame.pack();
       frame.setResizable(false);
       frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Closing the main window and showing the started window
        frame.setVisible(false);
        new Started();

        //User input fields
        String clientId = ClientId.ClientId.getText();
        String details = Details.Details.getText();
        String state = State.State.getText();
        String large = largeImageKey.largeImageKey.getText();
        String large1 = largeImageText.largeImageText.getText();
        String small = smallImageKey.smallImageKey.getText();
        String small1 = smallImageText.smallImageText.getText();

        //Starting the rich presence
        RichPresence.startRPC(clientId, details, state, large, large1, small, small1);
    }
}
