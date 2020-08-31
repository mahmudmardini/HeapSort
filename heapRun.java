package HeapSOrt;

public class heapRun {

	public static void main(String[] args) {

		int[] arr1 = {4,8,90,26,45,67,87,1};
		
		Heap heap1 = new Heap(arr1);
		
		heap1.heapSort();
		heap1.listele();

	}

}
