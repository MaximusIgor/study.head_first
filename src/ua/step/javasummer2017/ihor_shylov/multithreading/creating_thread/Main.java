package ua.step.javasummer2017.ihor_shylov.multithreading.creating_thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    Thread backgroundThread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Получение лопаты");
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Копай");
            }
            System.out.println("Сдача лопаты");
        }
    }, "Our Background Thread"); // Created
       // backgroundThread.setDaemon(true);

        backgroundThread.start(); // Running
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName());
        System.out.println();
        backgroundThread.interrupt();

        Thread thread = new Thread(new MyRunnable());
        thread.start();

    }
}
class  MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Some job");
    }
}
