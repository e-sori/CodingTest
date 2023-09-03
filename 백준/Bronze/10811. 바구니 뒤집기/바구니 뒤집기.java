import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer strSlice = new StringTokenizer(br.readLine());
        
        int basketNum = Integer.valueOf(strSlice.nextToken());
        int inputNum = Integer.valueOf(strSlice.nextToken());
        
        List<Integer> basketList = new ArrayList<Integer>();
        
        for(int i = 1; i <= basketNum; i += 1){
            basketList.add(i);
        }
        
        for(int i = 0; i < inputNum; i += 1){
            strSlice = new StringTokenizer(br.readLine());
            
            int changeBasketNum1 = Integer.valueOf(strSlice.nextToken());
            int changeBasketNum2 = Integer.valueOf(strSlice.nextToken());
            
            Collections.reverse(basketList.subList(changeBasketNum1 - 1,changeBasketNum2));
        }
        
        for(int num : basketList){
            bw.write(num + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}