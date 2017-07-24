
public class Fibo_Recurse {
	static int n1=0;
	static int n2 = 1;
	static int n3 = 0;

	public static void printFibo(int count){
		
		if(count>0){
			n3 = n1+n2;
			n1 =n2;
			n2 =n3;
			System.out.println(n3);
			printFibo(count -1);
			
		}
	}

	public static void main(String[] args) {
		System.out.println(n1+ " "+n2);
		int count =10;
		printFibo(count-1);

	}

}
