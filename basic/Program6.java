import java.io.*;
class NumBtwn{
	static int NumBtwn(int num1 , int num2){
		return num2-num1+1;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int count = NumBtwn(num1, num2);
		System.out.println(count);
	}
}
