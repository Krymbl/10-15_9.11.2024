public class L11 {
	public static void main(String[] args) {
		int s = 0;
		int mas1[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int mas2[] = {1, 2, 3, 4, 5, 9 ,7 ,8};
		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] != mas2[i]) {
				System.out.println(i);
				s = 1;
				return;				
			}
		}
		System.out.println("Одинаковые");		
	}
}
