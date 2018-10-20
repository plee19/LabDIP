package dip.lab3;

import javax.swing.JOptionPane;

public class DialogOutput implements Output {
    public void sendOutput(String s) {
        JOptionPane.showMessageDialog(null,"Output message: " + s);
    }
}
