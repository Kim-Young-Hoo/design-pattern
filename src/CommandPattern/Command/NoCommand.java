package CommandPattern.Command;


// 커맨드가 할당되지 않은 곳이 호출되었을 때 exception이 발생하지 않도록 null 객체를 전달해 둔다.
public class NoCommand implements Command{
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
