package com.idea.maven.bootstrap;

public class SynThread implements Runnable{

	private int count;
	
	public SynThread(){
		count = 0;
	}
	
	@Override
	public void run() {
		synchronized(this){
			for(int n=0; n<5; n++){
				try {
					System.out.println(Thread.currentThread().getName()+":"+(count++));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public int getCount(){
		return count;
	}

}
