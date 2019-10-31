package controlstatements;

public class NestedFor {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
//		for (i = 10; i <= 20; i++) {
//			for (j = 20; j <= 30; j++) {
//				System.out.println(i + " " + j);
//			}
//		}

		for (int n = 0; n <= 20; n++) {
			System.out.println(i++ + " " + j++);
		}

	}

}
