import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int[] remainNumList = new int[10];

    for(int i = 0; i < 10; i += 1) {
    	remainNumList[i] = (Integer.valueOf(br.readLine()) % 42);    	
    }
    
    remainNumList = Arrays.stream(remainNumList).distinct().toArray();
    
    bw.write(String.valueOf(remainNumList.length));
    bw.flush(); 
    bw.close(); 
    br.close();

    }    
}