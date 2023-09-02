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
    
    int basketIndex = Integer.valueOf(strSlice.nextToken());
    int changeBallCnt = Integer.valueOf(strSlice.nextToken());
    
    int[] basketArr = new int[basketIndex];
    
    for(int i = 0; i < basketIndex; i += 1) {
    	basketArr[i] = i + 1;
    }

    for (int i = 1; i <= changeBallCnt; i += 1) { 
    	strSlice = new  StringTokenizer(br.readLine());

	    int basketFirstNum = Integer.valueOf(strSlice.nextToken()); 
	    int basketSecondNum  = Integer.valueOf(strSlice.nextToken()); 
	    
	    int ballFirstNum = basketArr[basketFirstNum - 1];

	    basketArr[basketFirstNum - 1] = basketArr[basketSecondNum - 1];
	    basketArr[basketSecondNum - 1] = ballFirstNum;
    }
    
    for(int printArr : basketArr) {
    	bw.write(printArr + " ");
    }

    bw.flush(); 
    bw.close(); 
    br.close();

    }    
}