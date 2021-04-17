package DivideConquer;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };

		quick(arr, 0, arr.length - 1);
		for(int val: arr)
			System.out.print(val+",");
	}

	public static void quick(int[] arr, int lo, int hi) {
		//base case
		if(lo>=hi) {
			return;
			
		}
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int left = lo;
		int right = hi;
		while (left <= right) {
			// left problem point
			while (arr[left] < pivot)
				left++;

			// right prob point
			while (arr[right] > pivot)
				right--;

			// prob resolve: swap
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quick(arr, lo, right);
		quick(arr, left, hi);
	}

}
