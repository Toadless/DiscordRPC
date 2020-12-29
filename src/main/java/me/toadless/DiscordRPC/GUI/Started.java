package me.toadless.DiscordRPC.GUI;

import javax.swing.*;
import java.awt.*;

public class Started extends JFrame {
    public static JPanel started;
    public Started() {
        JFrame frame = new JFrame() ;
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder());
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        panel.setLayout(new GridLayout(0 ,1));

        //Page title
        JLabel title = new JLabel("Started RPC");
        title.setFont(new Font("Courier", Font.BOLD,50));
        panel.add(title);

        //Setting Icon
        ImageIcon image = new ImageIcon("src/logo.png");
        frame.setIconImage(image.getImage());

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Discord RPC Started");
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
    }
}
