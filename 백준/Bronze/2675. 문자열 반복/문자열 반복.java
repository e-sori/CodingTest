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
        	
        	for(int j = 0; j < repeatStr.length(); j += 1) {
        		String c = String.valueOf(repeatStr.charAt(j));
        		bw.write(c.repeat(repeatNum));
        	}
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}