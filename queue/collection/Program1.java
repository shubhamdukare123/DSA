//queue implementation in collection
import java.util.*;
class QueueDemo{
	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.add(40);
		System.out.println(q);
		System.out.println(q.peek()); //10
		System.out.println(q.element()); //10
		System.out.println(q); //[10 20 30 40]
		System.out.println(q.poll()); //10
		System.out.println(q); //[20 30 40]
		System.out.println(q.remove()); //20
		System.out.println(q); //[30 40]
	}
}
