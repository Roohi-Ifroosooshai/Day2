

import java.io.*;
import java.util.*;

import java.lang.Thread;
class Threads implements Runnable
{
 	Thread t;
        int N;
	Threads(int N)
        {
         this.N=N;
         t=new Thread(this, "Thread");
         System.out.println("New thread: " + t);
         t.start();
        }
       public void run()
        {
	   try{
            t.sleep(500);
        }
       catch(InterruptedException e)
       {
          System.out.println("Interrupted Exception");
       }
  }
}

  
class program2
{
   public static void main(String arg[])
    {
     try{
         Collection<Integer> list = new ArrayList<Integer>();
        new Threads(1);
            list.add(4);
            list.add(8);
            list.add(3);
        new Threads(2);
            list.add(8);
            list.add(3);
        new Threads(3);
            list.add(5);
            list.add(1);
                 System.out.println(list);
          Thread.sleep(1000);
        
     }
     catch(InterruptedException e)
      {
        System.out.println("Interrupted Exception");
      }
  }
}
