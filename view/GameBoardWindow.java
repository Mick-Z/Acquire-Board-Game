package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Name: Mick Zeller
 */
public class GameBoardWindow extends JPanel
{
    private final JButton[] tiles = new JButton[ 108 ];
    private final ImageIcon[] icons = new ImageIcon[ 9 ];
    private JButton button;
    String letters = "ABCDEFGHI";
    int tileNumber = 1;
    int tileLetter = 0;

    public GameBoardWindow()
    {
        setBorder(new EmptyBorder(20, 20, 20, 20));
        setLayout(new BorderLayout(0, 50));
        makeIconArray(icons.length);

        for (int i = 0; i < 108; i++)
        {
            if (tileNumber > 12)
            {
                tileNumber = 1;
                tileLetter++;
            }

            button = new JButton(letters.substring(tileLetter, tileLetter + 1) + String.valueOf(tileNumber));
            button.setContentAreaFilled(false);// removes the 3D effect of button
            button.setBackground(getBackground());
            tiles[ i ] = button;
            tiles[ i ].setIcon(icons[ 0 ]);
            tiles[ i ].setActionCommand(String.valueOf(i));


            add(tiles[ i ]);
            tileNumber++;
        }

    }

    public void makeIconArray(int size)
    {
        while (size >= 0)
        {
            icons[ (size - (size - 1)) ] = new ImageIcon(new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB));
            size--;
        }
    }
}
