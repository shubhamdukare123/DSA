// valid parenthesisCheck -- sir's approach
import java.util.*;
class ValidParanthesis{
	boolean checkValidParanthesis(String str){
		Stack<Character> s = new Stack<Character>();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch =='('|| ch == '[' || ch == '{'){
				s.push(ch);
			}else{
				if(!s.empty()){
					char x = s.peek();
					if((x == '(' && ch ==')')||(x=='[' && ch ==']') || (x=='{' && ch == '}')){
						s.pop();
					}else{
						return false;
					}
				}else{
					return false;
				}
				
			}
		}
		if(s.empty())
			return true;
		else
			return false;
	}
}

class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter paranthesis to check");
		String str = sc.next();
		ValidParanthesis obj = new ValidParanthesis();
		boolean flag = obj.checkValidParanthesis(str);
		if(flag)
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
	}
}
