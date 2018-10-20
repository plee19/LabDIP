package dip.lab3;

import javax.swing.JOptionPane;

public class DialogInput implements Input {
    public String getInput() {
        String response = JOptionPane.showInputDialog(null, "Enter message here:");
        return response;
    }
}
