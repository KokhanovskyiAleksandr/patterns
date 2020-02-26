package command.commands;

public class PreviousChannelButton implements Command {
    public void execute() {
        System.out.println("PreviousChannelButton was pressed");
    }

    public void revert() {
        System.out.println("PreviousChannelButton was revert");
    }
}