package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

/**
 * Name: Mick Zeller
 */
public class BoardPanel extends JPanel
{
    private final JButton[] tiles = new JButton[ 108 ];
    private final ImageIcon[] icons = new ImageIcon[ 9 ];
    private JButton button;
    String letters = "ABCDEFGHI";
    int tileNumber = 1;
    int tileLetter = 0;

    public BoardPanel()
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
            tiles[ i ].addActionListener(new TileHandler());

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


    private class TileHandler implements ActionListener
    {

        //private JButton updatingTile;

        @Override
        public void actionPerformed(ActionEvent e)
        {


            try
            {
                int tileLocation = Integer.parseInt(e.getActionCommand());
                System.out.println("Tile location " + tileLocation);


            } catch (Exception ex)
            {
                System.out.println(ex.toString());
            }

            // TODO: 12/31/2016 implement a way to send this data to the server 

        }


//        public void updatingBoard(String userName)
//        {
//            int t = 0;
//            String temp = gs.currentBoard.getJson().toString();
//            System.out.println(gs.currentBoard.getJson());
//            for (int i = 0; i < gs.currentBoard.getJson().length(); i++)
//            {
//                t = Integer.parseInt(temp.substring(i, i + 1));
//                tileStatus[ i ] = t;
//                testTileUpdate(i, tileStatus[ i ]);
//            }
//
//        }

        public void testTileUpdate(int index, int status)
        {

            if (status < 0 || status > 9 || index > tiles.length - 1)
            {
                return;
            }
            switch (status)
            {
                case 0:
                    button = tiles[ index ];
                    tiles[ index ] = button;
                    break;
                case 1:
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.RED, 3));
                    tiles[ index ] = button;
                    break;
                case 2:
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.BLUE, 3));
                    tiles[ index ] = button;
                    break;
                case 3:
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.YELLOW, 3));
                    tiles[ index ] = button;
                    break;
                case 4:
                    button = tiles[ index ];
                    button.setEnabled(false);
                    button.setBorder(new LineBorder(Color.GREEN, 3));
                    tiles[ index ] = button;
                    break;

                default:
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.PINK, 3));
                    tiles[ index ] = button;
                    break;
            }
        }


    }

}
