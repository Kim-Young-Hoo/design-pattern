package CommandPattern;

import CommandPattern.Command.Command;
import CommandPattern.Command.GarageDoorOpenCommand;
import CommandPattern.Command.LightOnCommand;
import CommandPattern.Invoker.SimpleRemoteController;
import CommandPattern.Receiver.GarageDoor;
import CommandPattern.Receiver.Light;

public class RunCommandPattern {
    public static void main(String[] args) {

        // controller 생성
        SimpleRemoteController simpleRemoteController = new SimpleRemoteController();
        
        // command 객체 생성
        Light light = new Light("평범한");
        Command command = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor("평범한");
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        // controller에 command를 변경해가며 테스트
        simpleRemoteController.setCommand(command);
        simpleRemoteController.buttonPressed();
        simpleRemoteController.setCommand(garageDoorOpenCommand);
        simpleRemoteController.buttonPressed();

    }
}
