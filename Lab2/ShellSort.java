public class ShellSort {

	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		for (int k = length/2; k > 0; k /= 2)
			for (int i = k; i < length; i++)
				for (int j = i; j >= k && array[j-k] > array[j]; j -= k) {
					int t = array[j];
					array[j] = array[j - k];
					array[j - k] = t;
				}
	    
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
} 