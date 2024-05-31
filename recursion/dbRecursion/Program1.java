class DoubleRecursion{
	int num1 = 1;
	int fun(int num){
		System.out.println(num1++);
		if(num<=1)
			return 1;
		return fun(num-2)+fun(num-1);
	}
	public static void main(String[] args){
		DoubleRecursion obj = new DoubleRecursion();
		int ret = obj.fun(8);
		System.out.println(ret);
	}
}
