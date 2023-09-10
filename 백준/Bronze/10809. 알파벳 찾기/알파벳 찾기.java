import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        // 아스키 코드 '0' == 45 , 'A' == 65, 'a' == 97 (소문자 - 대문자 = 32)
        // 문제의 포인트는 '처음' 찾은 문자의 '인덱스'를 출력하고, 없으면 -1을 출력한다는 점이다.
        // 만약 주어진 문자열이 apple인 경우 p의 자리에는 1이 들어간다.
        // indexOf는 문자열에서 특정 문자를 찾을 때 앞에서부터 찾고, '처음' 찾은 문자의 인덱스만 반환하며, 없으면 -1을 반환한다.
        // contains는 인덱스가 아닌 true / false 반환
        
        // 문자 하나에 ''를 감싸주면 자동으로 아스키코드르 통해 숫자로 변환
        for(int i = 'a'; i <= 'z'; i += 1) {
        	bw.write(String.valueOf(str.indexOf(i)) +" ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}