package CommandPattern.Command;

import CommandPattern.Receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.stop();
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.up();
        garageDoor.stop();
        garageDoor.lightOn();
    }
}
