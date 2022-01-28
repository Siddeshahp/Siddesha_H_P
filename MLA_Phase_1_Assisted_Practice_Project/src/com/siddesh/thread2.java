package com.siddesh;

public class thread2 implements Runnable{
	 
    public static int myCount = 0;
    public thread2(){
         
    }
    public void run() {
        while(thread2.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++thread2.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        thread2 mrt = new thread2();
        Thread t = new Thread(mrt);
        t.start();
        while(thread2.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++thread2.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}

