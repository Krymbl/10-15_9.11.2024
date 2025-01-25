public class L12 {
	public static void main(String args[]) {
		int c = 0;
		int mas1[] = {1, 2, 3, 4, 5, 6};
		int mas2[] = {2, 4, 3, 6, 1, 5};
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas2.length; j++){
				if (mas1[i] == mas2[j]) {
					c += 1;
				}
			}
		}
		if (c == mas1.length) {
			System.out.println("Эквивалентны");
		} else {
			System.out.println("Различны");
		}

	}
}