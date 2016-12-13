import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char n = scn.next().charAt(0);
		int n1 = n - 'a';
		int n2 = n - 'A';
		System.out.println(n1);
		if (n1 >= 0 && n1 < 26) {
			System.out.println("¤p¼g");
		} else {
			if (n2 >= 0 && n2 < 26) {
				System.out.println("¤j¼g");
			} else {
				System.out.println("¯S®í");
			}

		}

	}

}
