import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        scan.close();
        
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}