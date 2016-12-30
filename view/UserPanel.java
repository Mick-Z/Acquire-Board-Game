package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Name: Mick Zeller
 */
public class UserPanel extends JPanel
{

    private JLabel gameStartedLabel;
    private JPanel panel;
    private JLabel continentalLabel;
    private JLabel imperialLabel;
    private JLabel festivalLabel;
    private JLabel worldWideLabel;
    private JLabel americanLabel;
    private JLabel lexerLabel;
    private JLabel towerLabel;
    private GridBagLayout gbl_stockInfoLabelHolderPanel;
    private JPanel stockInfoLabelHolderPanel;
    private JPanel userNameLabelHolderPanel;


    /**
     * Create the panel.
     */
    public UserPanel()
    {

        setOpaque(false);
        setBorder(null);
        setLayout(null);
        setSize(new Dimension(384, 269));
        userNameLabelHolderPanel = new JPanel();
        userNameLabelHolderPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        userNameLabelHolderPanel.setBounds(0, 0, 184, 269);
        add(userNameLabelHolderPanel);

        stockInfoLabelHolderPanel = new JPanel();
        stockInfoLabelHolderPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        stockInfoLabelHolderPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        stockInfoLabelHolderPanel.setBounds(182, 0, 200, 234);
        add(stockInfoLabelHolderPanel);
        gbl_stockInfoLabelHolderPanel = new GridBagLayout();
        gbl_stockInfoLabelHolderPanel.columnWidths = new int[]
                {0, 0};
        gbl_stockInfoLabelHolderPanel.rowHeights = new int[]
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_stockInfoLabelHolderPanel.columnWeights = new double[]
                {1.0, Double.MIN_VALUE};
        gbl_stockInfoLabelHolderPanel.rowWeights = new double[]
                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        stockInfoLabelHolderPanel.setLayout(gbl_stockInfoLabelHolderPanel);
        towerLabel = new JLabel();
        //towerLabel = new JLabel(" TOWER  " + gameSession.getPlayer(name).getStockAmount(MessageFactory.Company.TOWER));
        towerLabel.setForeground(new Color(255, 255, 0));
        towerLabel.setHorizontalAlignment(SwingConstants.LEFT);
        towerLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        GridBagConstraints gbc_towerLabel = new GridBagConstraints();
        gbc_towerLabel.anchor = GridBagConstraints.WEST;
        gbc_towerLabel.fill = GridBagConstraints.VERTICAL;
        gbc_towerLabel.insets = new Insets(0, 0, 5, 0);
        gbc_towerLabel.gridx = 0;
        gbc_towerLabel.gridy = 1;
        stockInfoLabelHolderPanel.add(towerLabel, gbc_towerLabel);

        //lexerLabel = new JLabel(" LUXOR   " + gameSession.getPlayer(name).getStockAmount(MessageFactory.Company.TOWER));
        lexerLabel = new JLabel();
        lexerLabel.setForeground(new Color(255, 0, 0));
        lexerLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        GridBagConstraints gbc_luxorLabel = new GridBagConstraints();
        gbc_luxorLabel.anchor = GridBagConstraints.WEST;
        gbc_luxorLabel.insets = new Insets(0, 0, 5, 0);
        gbc_luxorLabel.gridx = 0;
        gbc_luxorLabel.gridy = 2;
        stockInfoLabelHolderPanel.add(lexerLabel, gbc_luxorLabel);

        americanLabel = new JLabel(" AMERICAN   ");//can't get the money call from GameSession to work
        americanLabel.setForeground(new Color(0, 0, 128));
        americanLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        GridBagConstraints gbc_americanLabel = new GridBagConstraints();
        gbc_americanLabel.anchor = GridBagConstraints.WEST;
        gbc_americanLabel.insets = new Insets(0, 0, 5, 0);
        gbc_americanLabel.gridx = 0;
        gbc_americanLabel.gridy = 3;
        stockInfoLabelHolderPanel.add(americanLabel, gbc_americanLabel);

        worldWideLabel = new JLabel(" WORLDWIDE  ");
        worldWideLabel.setForeground(new Color(128, 0, 0));
        worldWideLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        GridBagConstraints gbc_worldWideLabel = new GridBagConstraints();
        gbc_worldWideLabel.anchor = GridBagConstraints.WEST;
        gbc_worldWideLabel.insets = new Insets(0, 0, 5, 0);
        gbc_worldWideLabel.gridx = 0;
        gbc_worldWideLabel.gridy = 4;
        stockInfoLabelHolderPanel.add(worldWideLabel, gbc_worldWideLabel);
        //MessageFactory.Company.LUXOR;
        //TODO
        festivalLabel = new JLabel(" FESTIVAL    ");
        festivalLabel.setForeground(new Color(0, 128, 0));
        festivalLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        GridBagConstraints gbc_festivalLabel = new GridBagConstraints();
        gbc_festivalLabel.anchor = GridBagConstraints.WEST;
        gbc_festivalLabel.insets = new Insets(0, 0, 5, 0);
        gbc_festivalLabel.gridx = 0;
        gbc_festivalLabel.gridy = 5;
        stockInfoLabelHolderPanel.add(festivalLabel, gbc_festivalLabel);
        //TODO
        imperialLabel = new JLabel(" IMPERIAL  ");
        imperialLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        GridBagConstraints gbc_imperialLabel = new GridBagConstraints();
        gbc_imperialLabel.anchor = GridBagConstraints.WEST;
        gbc_imperialLabel.insets = new Insets(0, 0, 5, 0);
        gbc_imperialLabel.gridx = 0;
        gbc_imperialLabel.gridy = 6;
        stockInfoLabelHolderPanel.add(imperialLabel, gbc_imperialLabel);
        //TODO
        continentalLabel = new JLabel(" CONTINENTAL  ");
        continentalLabel.setForeground(new Color(0, 206, 209));
        continentalLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        GridBagConstraints gbc_continentalLabel = new GridBagConstraints();
        gbc_continentalLabel.insets = new Insets(0, 0, 5, 0);
        gbc_continentalLabel.anchor = GridBagConstraints.WEST;
        gbc_continentalLabel.gridx = 0;
        gbc_continentalLabel.gridy = 7;
        stockInfoLabelHolderPanel.add(continentalLabel, gbc_continentalLabel);

        panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.setBackground(new Color(255, 69, 0));
        panel.setBounds(182, 234, 200, 35);
        add(panel);
        panel.setLayout(null);

        gameStartedLabel = new JLabel("Waiting...");
        gameStartedLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
        gameStartedLabel.setBorder(null);
        gameStartedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gameStartedLabel.setHorizontalTextPosition(SwingConstants.LEFT);

        gameStartedLabel.setBounds(15, 0, 170, 35);
        panel.add(gameStartedLabel);

    }

}