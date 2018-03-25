public class MatrixPrint {
	public static void main(String[] args) {
		String [][] matrix = {
			{" * ", " 2 ", " 3 ", " 4 ", " * "},
			{" 6 ", " * ", " 8 ", " * ", "10 "},
			{"11 ", "12 ", " * ", "14 ", "15 "},
			{"16 ", " * ", "18 ", " * ", "20 "},
			{" * ", "22 ", "23 ", "24 ", " * "},
			};
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j]);
			} 
      System.out.println();
		}
	}
}