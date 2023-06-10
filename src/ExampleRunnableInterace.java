public class ExampleRunnableInterace {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {

                System.out.println("Start Runnable Thread");
            }
        };

        Runnable runnable1= ()->{
            System.out.println("Start Runnable Thread by Functional Interface");
        };
        new Thread(runnable).start();
        new Thread(runnable1).start();




}
}
