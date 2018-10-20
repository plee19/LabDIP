package dip.lab3;

public class MessageService {
    private Input inputMethod;
    private Output outputMethod;

    public Input getInputMethod() {
        return inputMethod;
    }

    public Output getOutputMethod() {
        return outputMethod;
    }

    public void setInputMethod(Input inputMethod) {
        this.inputMethod = inputMethod;
    }

    public void setOutputMethod(Output outputMethod) {
        this.outputMethod = outputMethod;
    }

    public MessageService (Input inputMethod, Output outputMethod) {
        setInputMethod(inputMethod);
        setOutputMethod(outputMethod);
    }

    public void runMessaging() {
        outputMethod.sendOutput(inputMethod.getInput());
    }
}
