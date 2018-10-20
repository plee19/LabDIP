package dip.lab3;

import java.util.Scanner;

public class ConsoleInput implements Input {
    public String getInput() {
        System.out.print("Enter message here: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        return input;
    }
}
