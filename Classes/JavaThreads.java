package Classes;
/* 
public class JavaThreads extends Thread {

    public void run(){
        System.out.println("This code is running in a thread");
        
    }

        public static void main(String[] args) {

        JavaThreads thread = new JavaThreads();
        thread.start();

        System.out.println("This code is outside of the thread");

    }

}

    or 

public class Main implements Runnable {

    public void run() {
        System.out.println("This code is running in a thread");

    }

        public static void main(String[] args) {
    
        JavaThreads obj = new JavaThreads();
        Thread thread = new Thread(obj);
        thread.start();

        System.out.println("This code is outside of the thread");
  }
  
}


Concurrency Problems
Because threads run at the same time as other parts of the program, 
there is no way to know in which order the code will run. 
When the threads and main program are reading and writing the same 
variables, the values are unpredictable. The problems that result from 
this are called concurrency problems.

Example
A code example where the value of the variable amount is unpredictable:

public class Main extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }

  public void run() {
    amount++;
  }
}

To avoid concurrency problems, it is best to share as few attributes 
between threads as possible. If attributes need to be shared, 
one possible solution is to use the isAlive() method of the thread to 
check whether the thread has finished running before using any 
attributes that the thread can change.


    */

public class JavaThreads extends Thread {

    public static int amount = 0;

    public static void main(String[] args) {

        JavaThreads thread = new JavaThreads();
        thread.start();

        while(thread.isAlive()) {

            System.out.println("Waiting....");

        }

        System.out.println("Main: " + amount);

        amount++;

        System.out.println("Main: " + amount);
    }

    public void run() {

        amount++;

    }

}


