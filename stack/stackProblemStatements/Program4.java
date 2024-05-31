//Check valid Paranthesis {([])}

import java.util.*;
class ValidParanthesis {
	boolean checkValidParanthesis(String str){
		Stack<Character> s = new Stack<Character>();
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++){
			if(s.empty()){
				if(ch[i] == ')' || ch[i] == ']' || ch[i] == '}')
					return false;
			}
			if(ch[i] == '(' || ch[i] == ')'){
				if(ch[i] == '(')
					s.push('(');
				else{
					if(s.peek() == '(')
						s.pop();
					else
						return false;
				}
			}
			else if(ch[i] == '[' || ch[i] == ']'){
				if(ch[i] == '[')
					s.push('[');
				else{
					if(s.peek() == '[')
						s.pop();
					else
						return false;
				}
			}
			else if(ch[i] == '{'|| ch[i] == '}'){
				if(ch[i] == '{')
					s.push('{');
				else{
					if(s.peek() == '{')
						s.pop();
					else
						return false;
				}
			}

		}
		if(s.empty())
			return true;
		return false;
	}
}

class Client {
	public static void main(String[] args){
 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter parenthesis for check!");
		String str = sc.next();
		ValidParanthesis obj = new ValidParanthesis();
		boolean flag = obj.checkValidParanthesis(str);
		if(flag == true)
			System.out.println("Paranthesis are valid");
		else{
			System.out.println("Paranthesis are not valid");
		}	
	}
}
