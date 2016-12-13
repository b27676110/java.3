import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next(); 
		char data[] = str.toCharArray();
		for(int i = data.length-1;i>=0;i--){
			System.out.print(data[i]);
		}

	}

}
