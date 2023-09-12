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
        int oriNum1 = Integer.valueOf(st.nextToken());
        int oriNum2 = Integer.valueOf(st.nextToken());
        
        int newNum1 = 0;
        int newNum2 = 0;
        
        while(oriNum1 != 0) {
        	newNum1 = (newNum1 * 10) + (oriNum1 % 10);
        	oriNum1 /= 10;
        }
        
        while(oriNum2 != 0) {
        	newNum2 = (newNum2 * 10) + (oriNum2 % 10);
        	oriNum2 /= 10;
        }
        
        int bigNum = newNum1 > newNum2 ? newNum1 : newNum2;
        
        bw.write(String.valueOf(bigNum));

        bw.flush();
        bw.close();
        br.close();
    }
}