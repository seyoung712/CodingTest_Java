import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //연산할 식의 개수
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=T; i++){
            st = new StringTokenizer(br.readLine()," "); //한 줄을 공백단위로 쪼개기
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append('\n');
        }
        br.close();
        
        System.out.println(sb);
    }
}