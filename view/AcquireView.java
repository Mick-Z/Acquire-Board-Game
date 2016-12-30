package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.IOException;

/**
 * Name: Mick Zeller
 */
public class AcquireView extends JFrame
{


    public AcquireView() throws IOException
    {
        GameBoardWindow gameBoardPanel;
        UserPanel gameInfo;
        ChatWindow chatPanel;


        setTitle("Acquire Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1250, 750);
        getContentPane().setLayout(null);
        //Prints out my hand of 6 tiles

        gameBoardPanel = new GameBoardWindow();
        gameBoardPanel.setBorder(new LineBorder(new Color(0, 0, 0)));

        gameBoardPanel.setBounds(15, 68, 781, 465);
        gameBoardPanel.setBackground(SystemColor.textHighlightText);
        gameBoardPanel.setLayout(new GridLayout(9, 12, 2, 2));
        getContentPane().add(gameBoardPanel);

        HandPanel handPanel = new HandPanel();
        handPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        handPanel.setLocation(new Point(25, 0));
        handPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        handPanel.setBounds(148, 549, 541, 77);
        getContentPane().add(handPanel);

        gameInfo = new UserPanel();
        gameInfo.setBorder(null);
        gameInfo.setBounds(811, 16, 403, 292);
        getContentPane().add(gameInfo);
        /**
         * Adding panel for chatting
         */
        chatPanel = new ChatWindow();
        chatPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        chatPanel.setBounds(811, 324, 403, 335);
        getContentPane().add(chatPanel);

        JLabel lblNewLabel = new JLabel("Acquire Board Game");
        lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel.setBounds(15, 16, 650, 68);
        getContentPane().add(lblNewLabel);

    }


}
