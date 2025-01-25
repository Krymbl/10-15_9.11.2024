public class L13 {
	public static void main(String args[]) {
		int mas1[][] = {{1, 2, 3},
					    {4, 5, 6},
					    {7, 8, 9}};
		int mas2[][] = {{1, 2, 3},
					    {4, 5, 6},
					    {7, 8, 9}};
		int mas3[][] = {{0, 0, 0},
					    {0, 0, 0},
					    {0, 0, 0}};

		if ((mas1.length == mas2.length) && (mas1[0].length == mas2[0].length)) {
			for (int i = 0; i < mas1.length; i++) {
				for (int j = 0; j < mas1[i].length; j++) {
					mas3[i][j] = mas1[i][j] + mas2[i][j];
				}
			}

		} else {
			System.out.println("NO");
		}
		for (int i = 0; i < mas1.length; i++) {
				for (int j = 0; j < mas1[i].length; j++) {
					System.out.print(mas3[i][j] + " ");
				}
				System.out.println();
			}
	}
}