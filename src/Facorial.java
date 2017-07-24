
public class Facorial {
	static	int  n =2;
	
	public static int getfactorial(int factor){
		int i =factor;
		int facorial = 0;
		if(i==0)
			return 1;
		
		if( i>0){
			
			 facorial= factor*(getfactorial(factor-1));
			
			return facorial;
			
			
		
	 }
		return facorial;
		
	}

	public static void main(String args[]){
		
		int  n =5;
		
		int fact =getfactorial(n);
		System.out.println(fact);
		
	}
}
