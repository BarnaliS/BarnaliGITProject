
public class BubbleSort 
{
	
	public static  void bubbleSort(int[] sortArray)
	{
		
		int n = sortArray.length;
		int temp = 0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(sortArray[j-1]>sortArray[j]){
					temp = sortArray[j-1];
					sortArray[j-1] = sortArray[j];
					sortArray[j] = temp;
					
				}
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		int[] array={6,1,90,23};
		System.out.println("Array befor bubble sort:");
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		bubbleSort(array);
     System.out.println("Array after bubble sort:");
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
	}

}
