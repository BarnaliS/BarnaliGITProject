
public class InsertionSort {
	public static void getInsertionSort(int[] arr){
		
		for(int j = 1;j<arr.length;j++){
			int key =arr[j];
			int i =j-1;
			while(i>-1 && arr[i]>key){
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
			
		}
		
	}
	

	public static void main(String[] args) {
		int[] array={6,1,90,23};
		System.out.println("Array befor insertion sort:");
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		getInsertionSort(array);
     System.out.println("Array after insertion sort:");
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
	}

}
