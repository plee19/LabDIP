package dip.lab3;

public class Startup {
    public static void main(String[] args) {
        Input inputMethod = new DialogInput();
        Output outputMethod = new DialogOutput();
        MessageService ms = new MessageService(inputMethod, outputMethod);

        ms.runMessaging();

        // I had some issues with using ConsoleInput/Output first. JOptionPane dialogs wouldn't show when set second.
        // This way works fine to demonstrate LSP, however.

        inputMethod = new ConsoleInput();
        outputMethod = new ConsoleOutput();
        ms = new MessageService(inputMethod, outputMethod);

        ms.runMessaging();
    }
}
