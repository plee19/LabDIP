package dip.lab3;

public class ConsoleOutput implements Output {
    public void sendOutput(String s) {
        System.out.println("Output message: " + s);
    }
}
