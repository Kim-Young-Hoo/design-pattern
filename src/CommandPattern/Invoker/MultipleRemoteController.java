package CommandPattern.Invoker;


import CommandPattern.Command.Command;
import CommandPattern.Command.NoCommand;

// invoker는 클라이언트의 요청을 받아서 Command 객체에게 명령을 실행하도록 유도한다.
// 실제로 Command나 Receiver가 무슨 일을 하는 지에 대해서는 관심이 없다.
public class MultipleRemoteController {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public MultipleRemoteController(Integer size) {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        // null 객체를 초기값으로 넣어준다. 비어있다면 excute()를 실행했을 때 exception이 발생, 이를 방지한다.
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    // 커맨드를 할당한다.
    public void setCommand(Integer slotNum, Command onCommand, Command offCommand) {
        onCommands[slotNum] = onCommand;
        offCommands[slotNum] = offCommand;
    }


    // 버튼을 누르면 각 커맨드에게 execute()를 하게 한다. 커맨드가 하는 일은 캡슐화 되어 invoker는 그 내부를 몰라도 된다.
    public void onButtonPressed(Integer slotNum) {
        onCommands[slotNum].execute();
        undoCommand = onCommands[slotNum];
    }

    public void offButtonPressed(Integer slotNum) {
        offCommands[slotNum].execute();
        undoCommand = offCommands[slotNum];
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }
}
