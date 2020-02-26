package command.commands;

public class NextChanelButton implements Command {
    public void execute() {
        System.out.println("NextChanelButton was pressed");
    }

    public void revert() {
        System.out.println("NextChanelButton was revert");
    }
}
