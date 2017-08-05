
public class SelectionSort {
	
	public static void getSortedArr(int[] arr){
		
		int n = arr.length;
		for(int i =0;i<n-1;i++){
			int index = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					index= j;//searching for lowest index
					
				}
				int smallerNumber = arr[index];
				arr[index] = arr[i];
				arr[i] = smallerNumber;
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {-1,5,2,9,6,22,-3};
		System.out.println("array before sorting:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		getSortedArr(arr);
		
		System.out.println("array after sorting:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
