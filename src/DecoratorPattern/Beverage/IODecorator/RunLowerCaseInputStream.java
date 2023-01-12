package DecoratorPattern.Beverage.IODecorator;

import java.io.*;

public class RunLowerCaseInputStream {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")
                            )
                    );

            while((c = in.read()) >= 0) {
                System.out.println((char) c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
