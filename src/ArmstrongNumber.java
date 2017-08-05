import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		String number = bf.readLine();
		int num = Integer.parseInt(number);
		int a,c=0,temp =0;
		temp = num;
		while(num>0){
		a = num%10;
		num = num/10;
		c = c+(a*a*a);
	}
		if(temp ==c)
		{
			System.out.println("the number is armstrong number");
		}
		else
			System.out.println("the number is not armstrong number");
  }
}
