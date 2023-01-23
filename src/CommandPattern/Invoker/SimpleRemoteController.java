package CommandPattern.Invoker;

import CommandPattern.Command.Command;

public class SimpleRemoteController {
    private Command slot;

    public SimpleRemoteController() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }

}
