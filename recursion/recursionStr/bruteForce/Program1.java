import java.util.*;
class CountVowel{
	int cVowelStr(String str){
		char ch[] = str.toCharArray();
		int count = 0;
		char vowelArr[] = new char[]{'a','e','i','o','u'};
		for(int i=0; i<ch.length; i++){
			for(int j=0; j<vowelArr.length; j++){
				if(ch[i] == vowelArr[j])
					count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		CountVowel obj = new CountVowel();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("The count of vowel is : "+obj.cVowelStr(str));

	}
}
