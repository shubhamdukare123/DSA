import java.util.*;

class WrongQuestionException extends RuntimeException{
	WrongQuestionException(String msg){
		super(msg);
	}
}
class Exam{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Exam Started");
		System.out.println("Wrong Question enter 1");
		int x = sc.nextInt();
		if(x==1){
			throw new WrongQuestionException("You'll get grace marks");
		}
		System.out.println("Exam Ended");
	}
}
