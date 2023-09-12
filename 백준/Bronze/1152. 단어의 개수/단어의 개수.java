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
        
        String inputStr = br.readLine();
        
        int count = 0;
        
        StringTokenizer st = new StringTokenizer(inputStr);
        
        while(st.hasMoreTokens()) {
        	st.nextToken();
        	count += 1;
        }
        
        bw.write(String.valueOf(count));
        

        bw.flush();
        bw.close();
        br.close();
    }
}