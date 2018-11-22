package week11;

public class Task1 {
  public static <T extends Comparable> void Sort (T[] arr) {
		int i, j;
		T temp;
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-1-i;j++) {
				if(  arr[j].compareTo(arr[j+1]) > 0  ) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	public static <T> void HienThi(T[] arr) {
		for ( T element : arr ){ 
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1, 3, 5, 2, 4, 6};
		Double[] arr1 = {1.2, 1.1, 1.3, 1.5, 1.4}; 
		Character[] arr2 = {'c', 'h', 'i', 'e', 'n'};
		Float[] arr3 = {1.2f, 1.4f, 1.3f, 5.1f};
		Short[] arr4 = {1000, 1999, 1954, 1975, 1986};
		Long[] arr5 = {100005154L, 156132L, 125848461655L, 11315441335L};
		Byte[] arr6 = {14, 12, 75, 126, 98};
		
		
		Task1.Sort(arr);
		Task1.Sort(arr1);
		Task1.Sort(arr2);
		Task1.Sort(arr3);
		Task1.Sort(arr4);
		Task1.Sort(arr5);
		Task1.Sort(arr6);
		
		
		Task1.HienThi(arr);
		Task1.HienThi(arr1);
		Task1.HienThi(arr2);
		Task1.HienThi(arr3);
		Task1.HienThi(arr4);
		Task1.HienThi(arr5);
		Task1.HienThi(arr6);
		
	}
}
