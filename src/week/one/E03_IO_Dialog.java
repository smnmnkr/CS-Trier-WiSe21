package week.one;

import javax.swing.JOptionPane;

public class E03_IO_Dialog {

    public static void main(String[] args) {

        int inputNumber;
        String inputText;

        inputText = JOptionPane.showInputDialog(null, "Please input: ");
        inputNumber = Integer.parseInt(inputText);

        JOptionPane.showMessageDialog(null, "Input: " + inputNumber);
    }
}
