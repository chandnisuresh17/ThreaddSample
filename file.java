package Threadd;

 class A implements Runnable{
//  class A extends Thread{
    public void run(){

    for (int i=0;i<5;i++){
        System.out.println("Hi");
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}  
}
 class S  implements Runnable{
//  class S extends Thread{
    public void run(){

    
    for(int i=0;i<5;i++){
        System.out.println("Hello");
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

}

public class file{
    public static void main(String[] args){
        // A obj1 = new A();
        // S obj2 = new S();
        Runnable obj1 = new A();
        Runnable obj2 = new S();
        // Thread t1 = new thread(obj1);
        // Thread t2 = new thread(obj2);
        
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());
        // obj1.start();
        t1.start();
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){
            e.printStackTrace();
    }
    Runnable obj1 = () -> 
       {
           for (int i=0;i<5;i++)
       {
            System.out.println("Hi");
            try{
            Thread.sleep(10);
            }
        catch(InterruptedException e)
            {
            e.printStackTrace();
            }
        }
       };
    //    Thread t1 = new Thread(obj1);
    // // obj2.start();
    //     t2.start();
    }

        // obj1.show();
        // obj2.show();

    }
