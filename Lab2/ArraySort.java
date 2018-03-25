public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int k;
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(array[j] < array[i]){
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        } 
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}  