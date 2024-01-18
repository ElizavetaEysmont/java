package src.ru.itmo.java.basics.multithreading;

public class FlowTread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print(i);
                }
            }
        });
        System.out.println("До запуска: " + thread.getState());
        thread.start();
        System.out.println(" После запуска: " + thread.getState());
        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Во время выполнения: " + thread.getState());
    }
}

