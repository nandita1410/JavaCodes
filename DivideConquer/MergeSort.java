package DivideConquer;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 80, 10, 50, 30, 60, 20, 75, 25 };

		int[] res = mergesort(arr, 0, arr.length - 1);
		for (int val : res)
			System.out.println(val);
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		// bc
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;
		int[] fh = mergesort(arr, lo, mid);
		int[] sh = mergesort(arr, mid + 1, hi);
		int[] res = merge2sortedArr(fh, sh);
		return res;

	}

	public static int[] merge2sortedArr(int[] one, int[] two) {
		int[] merged = new int[one.length + two.length];
		int i = 0;// one
		int j = 0;// two
		int k = 0;// merged

		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				merged[k] = one[i];
				i++;
				k++;
			} else {
				merged[k] = two[j];
				j++;
				k++;
			}
		}
		// two array finish, one arr elem consume
		if (j == two.length) {
			while (i < one.length) {
				merged[k] = one[i];
				i++;
				k++;
			}
		}
		// one arr finish, two arr elem consume
		if (i == one.length) {
			while (j < two.length) {
				merged[k] = two[j];
				j++;
				k++;

			}
		}
		return merged;
	}

}
