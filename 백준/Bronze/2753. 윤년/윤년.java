import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        
        if((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}