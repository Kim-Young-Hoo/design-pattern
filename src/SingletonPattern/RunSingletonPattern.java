package SingletonPattern;

public class RunSingletonPattern {
    public static void main(String[] args) {
        ChocolateBoilerSingleton chocolateBoilerSingleton = ChocolateBoilerSingleton.getInstance();
        chocolateBoilerSingleton.fill();
        chocolateBoilerSingleton.boil();
        chocolateBoilerSingleton.drain();
    }
}
