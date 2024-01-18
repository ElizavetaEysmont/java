package src.ru.itmo.java.basics.multithreading;

public class TenThreads {
    public static void main (String[] args){
        for (int i=0; i < 10; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0; i <= 100; i++){
                        System.out.println(i);
                        try {
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            });
            thread.start();
        }
    }

}
