package command;

import command.commands.Command;

import java.util.List;

public class Receiver {
    private List<Command> commands;


    void addCommand(Command command) {
        commands.add(command);
    }

    void addCommandList(List<Command> commands) {
        this.commands = commands;
    }

    void runCommand(Integer position) {
        Command command = commands.get(position);
        try {
            command.execute();
        } catch (Exception e) {
            command.revert();
        }
    }

    void runAllCommand() {
        try {
            commands.forEach(Command::execute);
        } catch (Exception e) {
            commands.forEach(Command::revert);
        }
    }
}
