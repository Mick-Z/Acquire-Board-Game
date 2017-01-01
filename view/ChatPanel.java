package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Name: Mick Zeller
 */
public class ChatPanel extends JPanel
{

    public ChatPanel()
    {
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setSize(new Dimension(400, 330));
        setSize(400, 295);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(15, 16, 370, 223);
        add(panel);
        panel.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 370, 223);
        panel.add(scrollPane);

        JTextArea messageArea = new JTextArea();
        messageArea.setFont(new Font("Calibri", Font.PLAIN, 15));
        messageArea.setEditable(false);
        scrollPane.setViewportView(messageArea);
        messageArea.setWrapStyleWord(true);

        JPanel sendPanel = new JPanel();
        sendPanel.setBounds(15, 255, 370, 76);
        add(sendPanel);
        sendPanel.setLayout(null);

        JButton sendButton = new JButton("Send");
        sendButton.setBounds(290, 16, 80, 29);
        sendPanel.add(sendButton);

        JTextField textField = new JTextField();
        textField.setBounds(0, 10, 275, 66);
        sendPanel.add(textField);
        textField.setColumns(10);

        JButton button = new JButton("End Turn");
        button.setEnabled(true);
        button.setBounds(290, 47, 80, 29);
        sendPanel.add(button);

    }
}
