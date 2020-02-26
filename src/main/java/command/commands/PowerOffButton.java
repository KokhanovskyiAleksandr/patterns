package command.commands;

public class PowerOffButton implements Command {
    public void execute() {
        System.out.println("PowerOffButton was pressed");
    }

    public void revert() {
        System.out.println("PowerOffButton was revert");
    }
}
