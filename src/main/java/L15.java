public class L15 {
	public static void main(String args[]) {
		int mas1[][] = {{2, 2, 2},
					    {2, 2, 2},
					    {2, 2, 2}};
		int mas2[][] = {{2, 2, 2},
					    {2, 2, 2},	
					    {2, 2, 2}};
		int mas3[][] = {{0, 0, 0},
					    {0, 0, 0},
					    {0, 0, 0}};

		if (mas1[0].length == mas2.length) {
			for (int i = 0; i < mas1.length; i++) {
				for (int j = 0; j < mas1[i].length; j++) {
					for (int q = 0; q < mas1[i].length; q++){
						mas3[i][j] += mas1[i][q] * mas2[q][j];
					}
					
				}
			}

		} else {
			System.out.println("NO");
			return;
		}
		for (int i = 0; i < mas3.length; i++) {
				for (int j = 0; j < mas3[i].length; j++) {
					System.out.print(mas3[i][j] + " ");
				}
				System.out.println();
			}
	}
}