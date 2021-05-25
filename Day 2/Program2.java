

class Thread1 implements Runnable{
   public void run() {
       try {
            for (int i = 1; i < 5; i++) {
                  System.out.println("Thread1: "+i);
            }
    } catch (Exception e) {
        e.getStackTrace();
    }
   }
}

class Thread2 implements Runnable{
       public void run() {
           try {
                for (int i = 5; i < 8; i++) {
                      System.out.println("Thread2: "+i);
                }
        } catch (Exception e) {
            e.getStackTrace();
        }
       }
    }
class Thread3 implements Runnable{
       public  void run() {
           try {
                for (int i = 8; i <13; i++) {
                      System.out.println("Thread3: "+i);
                }
        } catch (Exception e) {
            e.getStackTrace();
        }
       }
    }

public class Program2 {
public static void main(String[] args) {
    try {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        t1.start();

        t1.join();

        if( !t1.isAlive()) {
            t2.start();
        }

        t2.join();

        if (!t2.isAlive()) {
            t3.start(); 
        }

    }catch(InterruptedException e) {
        e.printStackTrace();
    }
}
}
