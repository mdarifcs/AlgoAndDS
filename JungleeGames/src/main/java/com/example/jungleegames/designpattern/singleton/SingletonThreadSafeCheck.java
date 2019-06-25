package com.example.jungleegames.designpattern.singleton;

public class SingletonThreadSafeCheck {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton s = Singleton.getInstance();
				synchronized (s) {
					Thread.currentThread().setName("thread1");
					System.out.println("before changing value");
					System.out.println(Thread.currentThread().getName()+" x="+s.x+" y="+s.y);
					s.x="arif";
					s.y=10;
					try {
						s.wait(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("after changing value");
					System.out.println(Thread.currentThread().getName()+" x="+s.x+" y="+s.y);
				}
				
			}
		});

		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Singleton s = Singleton.getInstance();
				Thread.currentThread().setName("thread2");
				System.out.println(Thread.currentThread().getName()+" x="+s.x+" y="+s.y);
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
