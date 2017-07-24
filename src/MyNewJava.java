
public class MyNewJava {

	public static void main(String[] args) {
			int count = 10;
			int n1  = 0;
			int n2 = 1;
			System.out.println(n1+" "+n2);
			for(int i=2;i<count;i++ ){
				int fib_no = n1+n2;
				System.out.println(" "+fib_no);
				n1= n2;
				n2 =fib_no;
				
			}
			
	}

}
