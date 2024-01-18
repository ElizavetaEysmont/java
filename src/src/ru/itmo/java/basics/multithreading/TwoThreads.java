package src.ru.itmo.java.basics.multithreading;

import javax.naming.Name;

public class TwoThreads {
    public static void main(String[] args) {
        Thread name1 = new MyThread("Лиза");
        Thread name2 = new MyThread("Егор");
        name1.start();
        name2.start();
    }

    static class MyThread extends Thread {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        public void run() {
            while (true) {
                synchronized (this) {
                    System.out.println(name);
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.notify();
                }
            }
        }
    }
}
