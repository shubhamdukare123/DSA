class MyThread extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("In run");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException obj){
				
			}
	}
}
}

class RMyThread implements Runnable{
	public void run(){
		System.out.println("In runnable thread");
	}
}
class ThreadDemo{
	public static void main(String[] args){
		RMyThread obj = new RMyThread();
		Thread t  = new Thread(obj);
		t.start();
		for(int i=0; i<10; i++){
			System.out.println("In main");
		}
	}
}
