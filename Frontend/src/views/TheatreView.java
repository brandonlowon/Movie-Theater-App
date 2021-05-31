package views;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TheatreView extends JFrame{
    private JPanel mainPanel;
    private JLabel mainLabel;
    private JComboBox<String> theatreChoice;
    private JTextArea theatreInformation;
    private JButton selectTheatreButton;
    private JButton exitToMainMenuButton;
    private JButton theatreInfo;
    private JFrame frame;


    public TheatreView() {
    	$$$setupUI$$$();
        setTitle("Movie Theater App");
        setContentPane(this.mainPanel);
        pack();
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);

    }

    public void addSelectButton(ActionListener actionListener) {
        selectTheatreButton.addActionListener(actionListener);
    }


    public void addExitButton(ActionListener actionListener) {
        exitToMainMenuButton.addActionListener(actionListener);
    }

    public void addInfoButton(ActionListener actionListener) {
        theatreInfo.addActionListener(actionListener);
    }

    public JComboBox getTheatreChoice() {
        return theatreChoice;
    }

    public JTextArea getTheatreInformation() {
        return theatreInformation;
    }

    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(7, 3, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-2500135));
        mainLabel = new JLabel();
        Font mainLabelFont = this.$$$getFont$$$(null, Font.BOLD, 26, mainLabel.getFont());
        if (mainLabelFont != null) mainLabel.setFont(mainLabelFont);
        mainLabel.setText("Choose a Theatre");
        mainPanel.add(mainLabel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        mainPanel.add(spacer1, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        theatreChoice = new JComboBox();
        theatreChoice.setFocusable(false);
        theatreChoice.setForeground(new Color(-5524801));
        final DefaultComboBoxModel<String> defaultComboBoxModel1 = new DefaultComboBoxModel<String>();
        defaultComboBoxModel1.addElement("Landmark Cinemas");
        defaultComboBoxModel1.addElement("Theater Calgary");
        defaultComboBoxModel1.addElement("Canyon Meadows Cinemas");
        defaultComboBoxModel1.addElement("Scotiabank Theater");
        defaultComboBoxModel1.addElement("Cineplex Odeon");
        theatreChoice.setModel(defaultComboBoxModel1);
        theatreChoice.setName("");
        theatreChoice.setToolTipText("");
        mainPanel.add(theatreChoice, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        selectTheatreButton = new JButton();
        selectTheatreButton.setText("Select");
        mainPanel.add(selectTheatreButton, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        exitToMainMenuButton = new JButton();
        Font exitToMainMenuButtonFont = this.$$$getFont$$$(null, Font.BOLD, 12, exitToMainMenuButton.getFont());
        if (exitToMainMenuButtonFont != null) exitToMainMenuButton.setFont(exitToMainMenuButtonFont);
        exitToMainMenuButton.setText("Exit to main menu");
        mainPanel.add(exitToMainMenuButton, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        mainPanel.add(spacer2, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, new Dimension(14, 132), null, 0, false));
        final Spacer spacer3 = new Spacer();
        mainPanel.add(spacer3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, new Dimension(14, 132), null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        mainPanel.add(scrollPane1, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(8, 132), null, 0, false));
        theatreInformation = new JTextArea();
        theatreInformation.setText("");
        scrollPane1.setViewportView(theatreInformation);
        theatreInfo = new JButton();
        theatreInfo.setText("Get Theatre Info");
        mainPanel.add(theatreInfo, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
