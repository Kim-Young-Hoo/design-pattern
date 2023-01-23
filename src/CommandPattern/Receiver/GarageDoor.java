package CommandPattern.Receiver;


// receiver는 execute() 명령을 통해 직접 로직이 실행해야 되는 객체이다.
public class GarageDoor {

    String type;

    public GarageDoor(String type) {
        this.type = type;
    }

    public void up() {
        System.out.println(type + " 문이 올라감");
    }

    public void stop() {
        System.out.println(type + " 문이 멈췄음");
    }

    public void lightOn() {
        System.out.println(type + " 불이 켜졌음");
    }

    public void down() {
        System.out.println(type + " 불이 내려감");
    }

    public void lightOff() {
        System.out.println(type + " 불이 꺼졌음");
    }
}
