import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder oriNum1 = new StringBuilder(st.nextToken());
        StringBuilder oriNum2 = new StringBuilder(st.nextToken());
                
        int newNum1 = Integer.valueOf(oriNum1.reverse().toString());
        int newNum2 = Integer.valueOf(oriNum2.reverse().toString());
        
        int bigNum = newNum1 > newNum2 ? newNum1 : newNum2;
        
        bw.write(String.valueOf(bigNum));

        bw.flush();
        bw.close();
        br.close();
    }
}