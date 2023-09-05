import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.valueOf(br.readLine());
        
        for(int i = 0; i < num; i +=1){
            String str = br.readLine();
            String print = String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length() - 1));
            bw.write(print + "\n");
        }        
                     
        bw.flush();
        bw.close();
        br.close();
    }
}