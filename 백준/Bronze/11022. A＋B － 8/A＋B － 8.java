import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); //테스트 케이스 개수
        int a,b,c;
        
        for(int i=1; i<=T; i++){
            a = scan.nextInt();
            b = scan.nextInt();
            c = a + b;
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + c);
        }
    }
}