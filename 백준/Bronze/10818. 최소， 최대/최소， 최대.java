import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        int[] numArr = new int[num];
        
        StringTokenizer strSlice = new StringTokenizer(nums);

        for(int i = 0; i < num; i += 1){
            numArr[i] = Integer.parseInt(strSlice.nextToken());
        }
        
        Arrays.sort(numArr);
        
        bw.write(String.valueOf(numArr[0]) + " " + String.valueOf(numArr[num - 1]));
        bw.flush();
        bw.close();
        br.close();
    }
}