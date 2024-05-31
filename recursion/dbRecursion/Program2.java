class FiboSeries{
	static int fibo(int num){
		if(num<1)
			return num;
		return  fibo(num-2) + fibo(num-1);
	}
	public static void main(String[] args){
		System.out.println(fibo(5));
	}

}
