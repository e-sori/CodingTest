import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int subject = Integer.valueOf(br.readLine());
    	double maxScore = 0.0;
    	double sum = 0.0;
    	double ava = 0.0;
    	
    	StringTokenizer strSlice = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < subject; i += 1) {
    		Double score = Double.valueOf(strSlice.nextToken());
    		sum += score;
    		if(maxScore < score) {
    			maxScore = score;
    		}
    	}    
    	ava = sum / maxScore * 100 / subject;
    	
    	bw.write(String.valueOf(ava));
    	
    	bw.flush();
    	bw.close();
    	br.close();    	
    }
}