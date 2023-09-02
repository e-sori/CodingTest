import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int max = 0;
    int index = 0;

    for (int i = 1; i <= 9; i += 1) {
        int num = Integer.parseInt(br.readLine());
        if (max < num) {
            max = num;
            index = i;
        }
    }

    bw.write(String.valueOf(max)+"\n"+String.valueOf(index));
    bw.flush();
    bw.close();
    br.close();
    }    
}
