class RecursionDemo{
	
	void fun(){
		System.out.println("In fun");
		fun();
	}
	public static void main(String[] args){
		RecursionDemo obj = new RecursionDemo();
		System.out.println("Start code");
		obj.fun();
		System.out.println("End code");
		
	}
}
