import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		int cnt=0;
		
		for(int i=0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		
		int v = in.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==v) cnt++;
		}

		System.out.println(cnt);
	}

}