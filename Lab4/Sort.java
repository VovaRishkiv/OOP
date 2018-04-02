public class Sort {
	private static void sort(int[] array, Comparator comp) {
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int val = array[i];
				int j;
				for (j = i; j >= gap && comp.compare(array[j - gap], val) > 0; j -= gap) {
					array[j] = array[j - gap];
				}
				array[j] = val;
			}
		}
	}

	public static void main(String[] args){
		int[] array = {1,5,2,4,10,6,0,3,10};
		Comparator comp = new Comparator();

		sort(array, comp);
        int[] array1 = new int[array.length];
        for(int k = array.length-1; k >= 0; k--){
            array1[array.length-1-k] = array[k];
        }
        array = array1;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}   