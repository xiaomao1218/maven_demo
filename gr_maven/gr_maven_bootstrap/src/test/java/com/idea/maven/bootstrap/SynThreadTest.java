package com.idea.maven.bootstrap;

public class SynThreadTest {

	public static void main(String[] args) {
		SynThread syncThread = new SynThread();
		Thread thread1 = new Thread(syncThread, "SyncThread1");
		Thread thread2 = new Thread(syncThread, "SyncThread2");
		thread1.start();
		thread2.start();
	}
}
