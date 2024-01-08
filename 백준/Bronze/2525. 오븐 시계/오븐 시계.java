import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt(); //현재 시각 (시)
		int B = in.nextInt(); //현재 시각 (분)
		
		int C = in.nextInt();
		
		int min = 60*A + B;
		min = min + C;
		
		int hour = (min/60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
	}

}
