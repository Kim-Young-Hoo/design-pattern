package SingletonPattern;

public class ChocolateBoilerSingleton {

    private boolean empty;
    private boolean boiled;

    // 프로그램에서 유일한 객체 하나를 갖고 있다.
    private static ChocolateBoilerSingleton uniqueChocolateBoilerSingleton;

    // thread safe하게 만드는 방법 2.
    // 애초부터 하나의 instance를 만들고 시작해버린다.
    //private static ChocolateBoilerSingleton uniqueChocolateBoilerSingleton = new ChocolateBoilerSingleton();

    // thread safe하게 만드는 방법 3.
    // DCL (double checked locking)을 써서 동기화 여부를 확인함.
//    private volatile static ChocolateBoilerSingleton uniqueChocolateBoilerSingleton

//    public static ChocolateBoilerSingleton getInstance() {
//        if (uniqueChocolateBoilerSingleton == null) {
//            synchronized (ChocolateBoilerSingleton.class) {
//                if (uniqueChocolateBoilerSingleton == null) {
//                    uniqueChocolateBoilerSingleton = new ChocolateBoilerSingleton();
//                }
//            }
//        }
//        return uniqueChocolateBoilerSingleton;
//    }


    // private 생성자이기 때문에 이 객체는 다른 곳에서 만들 수가 없다.
    private ChocolateBoilerSingleton() {
        this.empty = true;
        this.boiled = false;
    }


    // thread safe하게 만드는 방법 1.
    // synchronized로 동기화를 수행하여 스레드에서 안전하게 만들어 주는 방법.
    // 동기화 하지 않았을 경우 여러 스레드에서 여러 개의 인스턴스가 생성될 가능성이 너무 크기 때문이다.
    // synchronized 덕분에 한 스레드가 이 메소드 사용을 종료할 때까지 다른 스레드는 대기하게 된다.
    // 하지만 unique instance가 생성된 이후로는 동기화가 필요 없어지기 때문에 그 다음부터는 손해만 누적되게 된다.
    public static synchronized ChocolateBoilerSingleton getInstance() {
        if (uniqueChocolateBoilerSingleton == null) {
            uniqueChocolateBoilerSingleton = new ChocolateBoilerSingleton();
        }
        return uniqueChocolateBoilerSingleton;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
