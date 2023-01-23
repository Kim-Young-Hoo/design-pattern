package CommandPattern.Receiver;

public class Light {

    String type;

    public Light(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " 조명 불이 켜졌음");
    }

    public void off() {
        System.out.println(type + " 조명 불이 꺼졌음");
    }
}
