
public class Palindrome {

	public static void main(String[] args) {
		
		int number = 454;
		int temp = number;
		int r ,sum=0;
		while(number>0){
			r = number%10;
			sum = (sum*10)+r;
			number = number/10;
			
		}
		if(temp==sum){
			System.out.println("palidrome");
			
		}
		else
			System.out.println("not palidrome");

	}

}
