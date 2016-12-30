
import view.AcquireView;

import javax.swing.*;
import java.io.IOException;

/**
 * Name: Mick Zeller
 */
public class GamePlay
{
    public static void main(String[] args) throws IOException
    {

        AcquireView acquireView = new AcquireView();
        acquireView.setLocationRelativeTo(null);
        acquireView.setVisible(true);
        acquireView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
