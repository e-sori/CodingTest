import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer strSlice = null;
    
    strSlice = new StringTokenizer(br.readLine());
    
    int arrIndex = Integer.valueOf(strSlice.nextToken());
    int inputBallCnt = Integer.valueOf(strSlice.nextToken());
    
    int[] basketArr = new int[arrIndex];


    for (int i = 1; i <= inputBallCnt; i += 1) { 
    	strSlice = new  StringTokenizer(br.readLine());

	    int basketStartNum = Integer.valueOf(strSlice.nextToken()); 
	    int basketEndNum  = Integer.valueOf(strSlice.nextToken()); 
	    int ballNum = Integer.valueOf(strSlice.nextToken());

	    for(int j = basketStartNum - 1; j <= basketEndNum - 1; j += 1) {
	    	basketArr[j] = ballNum;
	    }
    }
    
    for(int printNum : basketArr){
        bw.write(printNum + " ");
    }

    bw.flush(); 
    bw.close(); 
    br.close();

    }    
}