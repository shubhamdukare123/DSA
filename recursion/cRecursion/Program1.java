class Recursion{
	void fun(int x){
		System.out.println(x);
		fun(--x);
	}
	public static void main(String[] args){
		Recursion obj = new Recursion();
		obj.fun(5);
	}
}
