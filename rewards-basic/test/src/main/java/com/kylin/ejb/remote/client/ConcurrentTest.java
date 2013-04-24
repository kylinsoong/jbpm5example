package com.kylin.ejb.remote.client;


public class ConcurrentTest {
	
	public static final int THREAD_SIZE = 1 ;

	public static void main(String[] args) {

		for(int i = 0 ; i < THREAD_SIZE ; i ++) {
			new Thread(new Runnable() {

				public void run() {
					
					try {
						RewardsBasicTest test = new RewardsBasicTest();
						
						while(true) {
							test.test();
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}).start();
		}
	}

}
