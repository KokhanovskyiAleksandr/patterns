package command;

import command.commands.NextChanelButton;
import command.commands.PowerOffButton;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        receiver.addCommandList((Arrays.asList(new NextChanelButton(), new PowerOffButton())));
        receiver.runAllCommand();
    }
}
