import java.io.*;
class SumNumDemo{
	static int sumNum(int num){
		
		return (num*(num+1))/2;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sum = sumNum(num);
		System.out.println(sum);
	}
}
