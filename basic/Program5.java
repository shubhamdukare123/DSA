import java.io.*;
class NumBtwn{
	static int numCount(int num1, int num2){
		int count = 0;
		for(int i=num1; i<=num2; i++){
			count++;
		}
		return count;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int count = numCount(num1, num2);
		System.out.println(count);
	}
}

