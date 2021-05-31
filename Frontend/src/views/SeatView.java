package views;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SeatView extends JFrame{
    private JPanel mainPanel;
    private JButton seat1;
    private JButton seat6;
    private JButton seat11;
    private JButton seat16;
    private JButton seat2;
    private JButton seat7;
    private JButton seat12;
    private JButton seat17;
    private JButton seat3;
    private JButton seat8;
    private JButton seat13;
    private JButton seat18;
    private JButton seat4;
    private JButton seat9;
    private JButton seat14;
    private JButton seat19;
    private JButton seat5;
    private JButton seat10;
    private JButton seat15;
    private JButton seat20;
    private JButton selectButton;
    private JButton goBackButton;
    //private JButton mainMenuButton;
    private JPanel panel1;
    private JPanel panel6;
    private JPanel panel11;
    private JPanel panel16;
    private JPanel panel2;
    private JPanel panel7;
    private JPanel panel12;
    private JPanel panel17;
    private JPanel panel3;
    private JPanel panel8;
    private JPanel panel13;
    private JPanel panel18;
    private JPanel panel4;
    private JPanel panel9;
    private JPanel panel14;
    private JPanel panel19;
    private JPanel panel5;
    private JPanel panel10;
    private JPanel panel15;
    private JPanel panel20;
    private JFrame frame;

    private ArrayList<JButton> listOfButton;

    public ArrayList<JButton> getListOfButton() {
        return listOfButton;
    }

    public SeatView() {
        setTitle("Movie Theater App");
        setContentPane(this.mainPanel);
        pack();
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
        listOfButton = new ArrayList<JButton>();
        addToArrayList();
    }

//    public void showError(String errMessage) {
//        JOptionPane.showMessageDialog(this, errMessage);
//    }

    public void addToArrayList() {
        listOfButton.add(seat1);
        listOfButton.add(seat2);
        listOfButton.add(seat3);
        listOfButton.add(seat4);
        listOfButton.add(seat5);
        listOfButton.add(seat6);
        listOfButton.add(seat7);
        listOfButton.add(seat8);
        listOfButton.add(seat9);
        listOfButton.add(seat10);
        listOfButton.add(seat11);
        listOfButton.add(seat12);
        listOfButton.add(seat13);
        listOfButton.add(seat14);
        listOfButton.add(seat15);
        listOfButton.add(seat16);
        listOfButton.add(seat17);
        listOfButton.add(seat18);
        listOfButton.add(seat19);
        listOfButton.add(seat20);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void addButtonSeat1(ActionListener actionListener) {
        seat1.addActionListener(actionListener);
    }

    public void addButtonSeat2(ActionListener actionListener) {
        seat2.addActionListener(actionListener);
    }

    public void addButtonSeat3(ActionListener actionListener) {
        seat3.addActionListener(actionListener);
    }

    public void addButtonSeat4(ActionListener actionListener) {
        seat4.addActionListener(actionListener);
    }

    public void addButtonSeat5(ActionListener actionListener) {
        seat5.addActionListener(actionListener);
    }

    public void addButtonSeat6(ActionListener actionListener) {
        seat6.addActionListener(actionListener);
    }

    public void addButtonSeat7(ActionListener actionListener) {
        seat7.addActionListener(actionListener);
    }

    public void addButtonSeat8(ActionListener actionListener) {
        seat8.addActionListener(actionListener);
    }

    public void addButtonSeat9(ActionListener actionListener) {
        seat9.addActionListener(actionListener);
    }

    public void addButtonSeat10(ActionListener actionListener) {
        seat10.addActionListener(actionListener);
    }

    public void addButtonSeat11(ActionListener actionListener) {
        seat11.addActionListener(actionListener);
    }

    public void addButtonSeat12(ActionListener actionListener) {
        seat12.addActionListener(actionListener);
    }

    public void addButtonSeat13(ActionListener actionListener) {
        seat13.addActionListener(actionListener);
    }

    public void addButtonSeat14(ActionListener actionListener) {
        seat14.addActionListener(actionListener);
    }

    public void addButtonSeat15(ActionListener actionListener) {
        seat15.addActionListener(actionListener);
    }

    public void addButtonSeat16(ActionListener actionListener) {
        seat16.addActionListener(actionListener);
    }

    public void addButtonSeat17(ActionListener actionListener) {
        seat17.addActionListener(actionListener);
    }

    public void addButtonSeat18(ActionListener actionListener) {
        seat18.addActionListener(actionListener);
    }

    public void addButtonSeat19(ActionListener actionListener) {
        seat19.addActionListener(actionListener);
    }

    public void addButtonSeat20(ActionListener actionListener) {
        seat20.addActionListener(actionListener);
    }

    public void addBackButton(ActionListener actionListener) {
        goBackButton.addActionListener(actionListener);
    }

    public void addSelectButton(ActionListener actionListener) {
        selectButton.addActionListener(actionListener);
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JButton getSeat1() {
        return seat1;
    }

    public void setSeat1(JButton seat1) {
        this.seat1 = seat1;
    }

    public JButton getSeat6() {
        return seat6;
    }

    public void setSeat6(JButton seat6) {
        this.seat6 = seat6;
    }

    public JButton getSeat11() {
        return seat11;
    }

    public void setSeat11(JButton seat11) {
        this.seat11 = seat11;
    }

    public JButton getSeat16() {
        return seat16;
    }

    public void setSeat16(JButton seat16) {
        this.seat16 = seat16;
    }

    public JButton getSeat2() {
        return seat2;
    }

    public void setSeat2(JButton seat2) {
        this.seat2 = seat2;
    }

    public JButton getSeat7() {
        return seat7;
    }

    public void setSeat7(JButton seat7) {
        this.seat7 = seat7;
    }

    public JButton getSeat12() {
        return seat12;
    }

    public void setSeat12(JButton seat12) {
        this.seat12 = seat12;
    }

    public JButton getSeat17() {
        return seat17;
    }

    public void setSeat17(JButton seat17) {
        this.seat17 = seat17;
    }

    public JButton getSeat3() {
        return seat3;
    }

    public void setSeat3(JButton seat3) {
        this.seat3 = seat3;
    }

    public JButton getSeat8() {
        return seat8;
    }

    public void setSeat8(JButton seat8) {
        this.seat8 = seat8;
    }

    public JButton getSeat13() {
        return seat13;
    }

    public void setSeat13(JButton seat13) {
        this.seat13 = seat13;
    }

    public JButton getSeat18() {
        return seat18;
    }

    public void setSeat18(JButton seat18) {
        this.seat18 = seat18;
    }

    public JButton getSeat4() {
        return seat4;
    }

    public void setSeat4(JButton seat4) {
        this.seat4 = seat4;
    }

    public JButton getSeat9() {
        return seat9;
    }

    public void setSeat9(JButton seat9) {
        this.seat9 = seat9;
    }

    public JButton getSeat14() {
        return seat14;
    }

    public void setSeat14(JButton seat14) {
        this.seat14 = seat14;
    }

    public JButton getSeat19() {
        return seat19;
    }

    public void setSeat19(JButton seat19) {
        this.seat19 = seat19;
    }

    public JButton getSeat5() {
        return seat5;
    }

    public void setSeat5(JButton seat5) {
        this.seat5 = seat5;
    }

    public JButton getSeat10() {
        return seat10;
    }

    public void setSeat10(JButton seat10) {
        this.seat10 = seat10;
    }

    public JButton getSeat15() {
        return seat15;
    }

    public void setSeat15(JButton seat15) {
        this.seat15 = seat15;
    }

    public JButton getSeat20() {
        return seat20;
    }

    public void setSeat20(JButton seat20) {
        this.seat20 = seat20;
    }

    public JButton getSelectButton() {
        return selectButton;
    }

    public void setSelectButton(JButton selectButton) {
        this.selectButton = selectButton;
    }

    public JButton getGoBackButton() {
        return goBackButton;
    }

    public void setGoBackButton(JButton goBackButton) {
        this.goBackButton = goBackButton;
    }

//    public JButton getMainMenuButton() {
//        return mainMenuButton;
//    }

//    public void setMainMenuButton(JButton mainMenuButton) {
//        this.mainMenuButton = mainMenuButton;
//    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel6() {
        return panel6;
    }

    public void setPanel6(JPanel panel6) {
        this.panel6 = panel6;
    }

    public JPanel getPanel11() {
        return panel11;
    }

    public void setPanel11(JPanel panel11) {
        this.panel11 = panel11;
    }

    public JPanel getPanel16() {
        return panel16;
    }

    public void setPanel16(JPanel panel16) {
        this.panel16 = panel16;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel7() {
        return panel7;
    }

    public void setPanel7(JPanel panel7) {
        this.panel7 = panel7;
    }

    public JPanel getPanel12() {
        return panel12;
    }

    public void setPanel12(JPanel panel12) {
        this.panel12 = panel12;
    }

    public JPanel getPanel17() {
        return panel17;
    }

    public void setPanel17(JPanel panel17) {
        this.panel17 = panel17;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel8() {
        return panel8;
    }

    public void setPanel8(JPanel panel8) {
        this.panel8 = panel8;
    }

    public JPanel getPanel13() {
        return panel13;
    }

    public void setPanel13(JPanel panel13) {
        this.panel13 = panel13;
    }

    public JPanel getPanel18() {
        return panel18;
    }

    public void setPanel18(JPanel panel18) {
        this.panel18 = panel18;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JPanel getPanel9() {
        return panel9;
    }

    public void setPanel9(JPanel panel9) {
        this.panel9 = panel9;
    }

    public JPanel getPanel14() {
        return panel14;
    }

    public void setPanel14(JPanel panel14) {
        this.panel14 = panel14;
    }

    public JPanel getPanel19() {
        return panel19;
    }

    public void setPanel19(JPanel panel19) {
        this.panel19 = panel19;
    }

    public JPanel getPanel5() {
        return panel5;
    }

    public void setPanel5(JPanel panel5) {
        this.panel5 = panel5;
    }

    public JPanel getPanel10() {
        return panel10;
    }

    public void setPanel10(JPanel panel10) {
        this.panel10 = panel10;
    }

    public JPanel getPanel15() {
        return panel15;
    }

    public void setPanel15(JPanel panel15) {
        this.panel15 = panel15;
    }

    public JPanel getPanel20() {
        return panel20;
    }

    public void setPanel20(JPanel panel20) {
        this.panel20 = panel20;
    }

    public static void main(String[] args) {
        SeatView view = new SeatView();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(6, 11, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-2500135));
        final Spacer spacer1 = new Spacer();
        mainPanel.add(spacer1, new GridConstraints(1, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        mainPanel.add(spacer2, new GridConstraints(1, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        selectButton = new JButton();
        selectButton.setText("Select");
        mainPanel.add(selectButton, new GridConstraints(2, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        goBackButton = new JButton();
        goBackButton.setText("Go Back");
        mainPanel.add(goBackButton, new GridConstraints(3, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        //mainMenuButton = new JButton();
        //mainMenuButton.setText("Main Menu");
        //mainPanel.add(mainMenuButton, new GridConstraints(4, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat1 = new JButton();
        seat1.setText("1");
        panel1.add(seat1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel6 = new JPanel();
        panel6.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel6, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat6 = new JButton();
        seat6.setText("6");
        panel6.add(seat6, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel11 = new JPanel();
        panel11.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel11, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat11 = new JButton();
        seat11.setText("11");
        panel11.add(seat11, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel16 = new JPanel();
        panel16.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel16, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat16 = new JButton();
        seat16.setText("16");
        panel16.add(seat16, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel2, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat2 = new JButton();
        seat2.setText("2");
        panel2.add(seat2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel7 = new JPanel();
        panel7.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel7, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat7 = new JButton();
        seat7.setText("7");
        panel7.add(seat7, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel12 = new JPanel();
        panel12.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel12, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat12 = new JButton();
        seat12.setText("12");
        panel12.add(seat12, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel17 = new JPanel();
        panel17.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel17, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat17 = new JButton();
        seat17.setText("17");
        panel17.add(seat17, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel3, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat3 = new JButton();
        seat3.setText("3");
        panel3.add(seat3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel8 = new JPanel();
        panel8.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel8, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat8 = new JButton();
        seat8.setText("8");
        panel8.add(seat8, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel13 = new JPanel();
        panel13.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel13, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat13 = new JButton();
        seat13.setText("13");
        panel13.add(seat13, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel18 = new JPanel();
        panel18.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel18, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat18 = new JButton();
        seat18.setText("18");
        panel18.add(seat18, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel4, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat4 = new JButton();
        seat4.setText("4");
        panel4.add(seat4, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel9 = new JPanel();
        panel9.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel9, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat9 = new JButton();
        seat9.setText("9");
        panel9.add(seat9, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel14 = new JPanel();
        panel14.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel14, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat14 = new JButton();
        seat14.setText("14");
        panel14.add(seat14, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel19 = new JPanel();
        panel19.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel19, new GridConstraints(4, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat19 = new JButton();
        seat19.setText("19");
        panel19.add(seat19, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel5 = new JPanel();
        panel5.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel5, new GridConstraints(1, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat5 = new JButton();
        seat5.setText("5");
        panel5.add(seat5, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel10 = new JPanel();
        panel10.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel10, new GridConstraints(2, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat10 = new JButton();
        seat10.setText("10");
        panel10.add(seat10, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel15 = new JPanel();
        panel15.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel15, new GridConstraints(3, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat15 = new JButton();
        seat15.setText("15");
        panel15.add(seat15, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel20 = new JPanel();
        panel20.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel20, new GridConstraints(4, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        seat20 = new JButton();
        seat20.setText("20");
        panel20.add(seat20, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("");
        mainPanel.add(label1, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        mainPanel.add(spacer3, new GridConstraints(2, 9, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        mainPanel.add(spacer4, new GridConstraints(2, 10, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        mainPanel.add(spacer5, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer6 = new Spacer();
        mainPanel.add(spacer6, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, new Dimension(-1, 20), 0, false));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD, 14, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setText("Seat Selection");
        mainPanel.add(label2, new GridConstraints(0, 8, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setIcon(new ImageIcon(getClass().getResource("/images/SeatLegend.png")));
        label3.setText("");
        mainPanel.add(label3, new GridConstraints(5, 8, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
