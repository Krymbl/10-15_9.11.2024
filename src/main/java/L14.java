public class L14 {
	public static void main(String[] args) {
		int[] vec1 = {1,5,3};
		int[] vec2 = {-1,3,8};
		int scal = 0;
		int razmer = vec1.length;
		for (int i = 0; i < razmer; i++) {
			scal += vec1[i]*vec2[i];
		}
		System.out.println(scal);
	}
}