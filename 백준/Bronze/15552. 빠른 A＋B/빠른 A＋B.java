import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalNum = Integer.parseInt(scan.readLine());

        for(int i = 1; i <= totalNum; i += 1){
            String twoNum = scan.readLine();
            StringTokenizer strSlice = new StringTokenizer(twoNum);

            int num1 = Integer.parseInt(strSlice.nextToken());
            int num2 = Integer.parseInt(strSlice.nextToken());

            print.write((num1 + num2) + "\n");
        }
        print.flush();
        print.close();
    }
}