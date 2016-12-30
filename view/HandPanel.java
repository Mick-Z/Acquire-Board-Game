package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Name: Mick Zeller
 */
public class HandPanel extends JPanel
{

    private static final long serialVersionUID = 1L;
    private JPanel panel_5;
    private JPanel panel_4;
    private JPanel panel_3;
    private JPanel panel_2;
    private JPanel panel_1;
    private JPanel panel_6;
    private JLabel lblNewLabel;

    /**
     * Create the panel.
     */
    public HandPanel()
    {

        setLayout(new GridLayout(0, 1, 0, 0));

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(null);

        panel_5 = new JPanel();
        panel_5.setBackground(new Color(192, 192, 192));
        panel_5.setLocation(124, 16);
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_5.setSize(new Dimension(50, 50));
        panel.add(panel_5);

        panel_4 = new JPanel();
        panel_4.setBackground(new Color(192, 192, 192));
        panel_4.setLocation(189, 16);
        panel_4.setSize(new Dimension(50, 50));
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_4);

        panel_3 = new JPanel();
        panel_3.setBackground(new Color(192, 192, 192));
        panel_3.setLocation(254, 16);
        panel_3.setSize(new Dimension(50, 50));
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_3);

        panel_2 = new JPanel();
        panel_2.setBackground(new Color(192, 192, 192));
        panel_2.setLocation(319, 16);
        panel_2.setSize(new Dimension(50, 50));
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_2);

        panel_1 = new JPanel();
        panel_1.setBackground(new Color(192, 192, 192));
        panel_1.setLocation(384, 16);
        panel_1.setSize(new Dimension(50, 50));
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_1);

        panel_6 = new JPanel();
        panel_6.setBackground(new Color(192, 192, 192));
        panel_6.setSize(new Dimension(50, 50));
        panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_6.setBounds(449, 16, 50, 50);
        panel.add(panel_6);

        lblNewLabel = new JLabel("Hand");
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(15, 16, 94, 50);
        panel.add(lblNewLabel);

    }
}
