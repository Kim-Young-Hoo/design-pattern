package CommandPattern.Command;

import CommandPattern.Receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.stop();
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        // 생략
    }
}
