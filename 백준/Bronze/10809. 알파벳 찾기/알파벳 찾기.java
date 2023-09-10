import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        int[] aArr = new int[26];
        Arrays.fill(aArr, -1);
        
        // 아스키 코드 '0' == 45 , 'A' == 65, 'a' == 97 (소문자 - 대문자 = 32)
        for(int a = 0; a < 26; a += 1) {
        	for(int i = 0; i < str.length(); i += 1) {
        		if((char)(a + 97) ==  str.charAt(i) && aArr[a] == -1) {
        			aArr[a] = i;
        		}
        	}
        }
        
        for(int a : aArr) {
        	bw.write(String.valueOf(a) + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}