package FacadePattern;


// 클라이언트는 얘만 신경 쓰면 된다.
public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load();
        hardDrive.read();
        cpu.jump();
        cpu.execute();
    }
}
