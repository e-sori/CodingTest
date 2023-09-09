import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        
        int num = Integer.valueOf(br.readLine());
        int sum = 0;
        
        // 숫자들을 String으로 받아줬음
        String numGroup = br.readLine();
        
        for(int i = 0; i < num; i += 1) {
			/*
			 * charAt의 사용법을 주의한다. 위에서 numGroup을 문자열 String으로 받아준 것을 기억해야한다! 
			 * 만약 numGroup이 1234라면... 숫자 1234가 아닌 문자열 "1234"라는 점 유의 
			 * 즉 charAt로 하나씩 떼어내어 데이터 형이char가 됐을 때  '1'은 숫자 1이 아니고 아스키 코드에 따라 49가 된다. 
			 * 그래서 '0' (아스키 코드에 따르면 숫자 48) 를 빼주면 숫자 1이 나온다.
			 */
        	sum += numGroup.charAt(i) - '0';
        }
        
        // BufferedWriter는 문자열을 출력하기 때문에 다시 형변환
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }
}