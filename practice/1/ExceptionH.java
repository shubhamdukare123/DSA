import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int x = 10/0;
		}catch(RuntimeException obj){
			System.out.println("Exception Handled");
		}catch(Exception obj){
			System.out.println("In runtimeexception");
		}finally{
			System.out.println("In finally");
		}
		try{
			throw new ArithmeticException("Shubham Exception");
		}catch(ArithmeticException obj){
			System.out.println("Shubham Catch");
			System.out.println(Thread.currentThread().getName());
			System.out.println(obj.getMessage());
			obj.printStackTrace();
		}
	}
}
