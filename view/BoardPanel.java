package view;

import control.GameHub;

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
    private String letters = "ABCDEFGHI";
    private int tileNumber = 1;
    private int tileLetter = 0;
    GameHub test = new GameHub();
    private int[] testState;
    //GameHub hub;
    //public BoardPanel(GameHub aHub){hub = aHub}

    // TODO: 12/31/2016 make an overloaded constructor that accepts and instance of GameHub
    public BoardPanel()
    {
        testState = test.updateBoard();
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
        @Override
        public void actionPerformed(ActionEvent e)
        {


            try
            {
                int tileLocation = Integer.parseInt(e.getActionCommand());
                System.out.println("Tile location " + tileLocation);
                System.out.println(testState.length);
                for (int i = 0; i < testState.length; i++)
                {
                    updateBoard(i, testState[ i ]);
                }

            } catch (Exception ex)
            {
                System.out.println(ex.toString());
            }

            // TODO: 12/31/2016 implement a way to send this data to the server 

        }
        /*American red
        Continental blue
        Festival green
        Imperial yellow
        Luxor purple
        Tower brown
        Worldwide orange*/

        public void updateBoard(int index, int status)
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
                case 1://Tile placed no hotel
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.BLACK, 3));
                    tiles[ index ] = button;
                    break;
                case 2://American Hotel
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.RED, 3));
                    tiles[ index ] = button;
                    break;
                case 3://Continental Hotel
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.BLUE, 3));
                    tiles[ index ] = button;
                    break;
                case 4://Festival Hotel
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.GREEN, 3));
                    tiles[ index ] = button;
                    break;
                case 5://Imperial Hotel
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.YELLOW, 3));
                    tiles[ index ] = button;
                    break;
                case 6://Luxor Hotel
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.MAGENTA, 3));
                    tiles[ index ] = button;
                    break;
                case 7://Tower Hotel
                    button = tiles[ index ];
                    button.setBorder(new LineBorder(Color.CYAN, 3));// TODO: 12/31/2016 change to brown
                    tiles[ index ] = button;
                    break;
                case 8://Worldwide Hotel
                    button = tiles[ index ];
                    button.getBackground().brighter();
                    button.setBorder(new LineBorder(Color.ORANGE, 3));
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
