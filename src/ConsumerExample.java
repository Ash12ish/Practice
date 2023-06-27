import java.util.function.Consumer;

public class ConsumerExample {


    public static void main(String args[])
    {
        Consumer<String> consume = (s)->{
            System.out.println(s.toUpperCase());
        };

        consume.accept("Consumer in java 8");
        System.out.println("Consumer "+consume);
    }
}
