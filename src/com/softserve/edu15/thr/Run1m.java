package com.softserve.edu15.thr;

public class Run1m implements Runnable {

	public void run() {
		boolean isWait = true;
		int k;
		System.out.println("- Thread ID = " + Thread.currentThread().getId());
		for (int i = 0; i < 100; i++) {
			// App.go(Thread.currentThread().getId());

			k = App.sum;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			App.sum = k - 1;
			System.out.print("-");



/*

			// synchronized (App.class) {
			synchronized (App.monitor) {
				k = App.sum;
				try {
					if ((k < 0) && isWait) {
//						System.out.print("WAIT");
//						App.monitor.wait();
//						System.out.print("RUN");
//						k = App.sum;
						// App.monitor.notifyAll();
						isWait = false;
					}
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				App.sum = k - 1;
				System.out.print("-");
				// App.monitor.notifyAll();
			}
*/


		}
		System.out.println(" DONE-, sum=" + App.sum);
	}
}
