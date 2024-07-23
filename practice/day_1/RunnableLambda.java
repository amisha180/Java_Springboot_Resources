package com.java.practice.day_1;

public class RunnableLambda {

	public static void main(String[] args) {
		//Prior to java 8
		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable with Anonymous Class");
			}
		};
		new Thread(runnable1).start();

		// Passing a Runnable when creating a new thread
        new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        }).start();;
        
        //With Java 8
		Runnable runnable2 = () -> {
			System.out.println("Runnable with Lambda Expression");
		};
		new Thread(runnable2).start();
	}

}
