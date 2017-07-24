import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence");
		String s = bf.readLine();
		char[] chArr = s.toCharArray();
		for(int i=chArr.length-1;i>=0;i--){
			System.out.println(chArr[i]);
			
		}
		//using stringbuilder
		
		BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence");
		String input = bf1.readLine();
		StringBuilder sb  = new StringBuilder();
		sb.append(input);
		StringBuilder reveresed = sb.reverse();
		System.out.println(reveresed);
		
		
		
		String input1 = "Be in present";
	     char[] hello=input1.toCharArray();
	     List<Character> trial1= new LinkedList<>();
	     for(char c: hello)
	     trial1.add(c);
	     Collections.reverse(trial1);
	     ListIterator li = trial1.listIterator();  
	     while(li.hasNext())
	    {System.out.print(li.next());}  
	   }
	}


