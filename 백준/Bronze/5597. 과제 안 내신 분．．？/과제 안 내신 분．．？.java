import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int[] studentList = new int[30];

    for(int i = 0; i < 28; i += 1) {
    	int studentNum = Integer.valueOf(br.readLine());
    	studentList[studentNum - 1] = studentNum;
    }
    
    int index = 0;
    for(int noSubmit : studentList) {
    	index += 1;
    	if(noSubmit == 0) {
    		bw.write(index + "\n");
    	}
    }
    bw.flush(); 
    bw.close(); 
    br.close();

    }    
}