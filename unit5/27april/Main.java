//creae a thread by extending 

class myThread extends Thread {
    
    public void run() {
        System.out.println("Running in a separate thread!");
    }
    try {
        Thread.sleep(1000); // Sleep for 1 second
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}.sttart();

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    th1.sttart();
}