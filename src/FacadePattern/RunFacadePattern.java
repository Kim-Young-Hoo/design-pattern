package FacadePattern;

public class RunFacadePattern {
    public static void main(String[] args) {
        // 클라이언트는 컴퓨터를 부팅 시킬 때 내부적으로 어떻게 돌아가는지 관심 없다.
        // Facade 인터페이스만 건드리면 그만.
        Computer computer = new Computer();
        computer.startComputer();
    }
}
