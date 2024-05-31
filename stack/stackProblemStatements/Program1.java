import java.util.*;

class RevString {
	String reverse(String str){
		Stack<Character> s = new Stack<Character>();
	//	String rev = "";
	 	char stackArr[] = new char[str.length()];
		for(int i=0; i<str.length(); i++){
			s.push(str.charAt(i));
		}
	/*	for(int i=0; i<str.length(); i++){
			rev = rev + s.pop();
		}
	*/
		for(int i=0; i<str.length(); i++){
			stackArr[i] = s.pop();
		}

		return new String(stackArr);
	}
}

class Client{
	public static void main(String[] args){
		RevString obj = new RevString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		String rev = obj.reverse(str);
		System.out.println("Reversed string is " + rev);
	}
}
