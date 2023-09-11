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
        
        int inputNum = Integer.valueOf(br.readLine());
        
        for(int i = 0; i < inputNum; i += 1) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	int repeatNum = Integer.valueOf(st.nextToken());
        	String repeatStr = st.nextToken();
        	
        	StringBuffer sb = new StringBuffer();
        	for(int j = 0; j < repeatStr.length(); j += 1) {
        		char c = repeatStr.charAt(j);
        		for(int k = 0; k < repeatNum; k += 1) {
        			sb.append(c);
        		}
        	}
        	bw.write(sb.toString());     
        	bw.write("\n");    
        }
        bw.flush();
        bw.close();
        br.close();
    }
}