import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String numStr = br.readLine();
		int callTime = 0;
		
		for(int i = 0; i < numStr.length(); i++) {
			char numCh = numStr.charAt(i);
			if(numCh < 'A') {
				// A보다 작은 문자는 입력 불가능 바로 반복문을 끝낸다.
				break;
			}else if(numCh < 'D') {
				callTime += 3;
			}else if(numCh < 'G') {
				callTime += 4;
			}else if(numCh < 'J') {
				callTime += 5;
			}else if(numCh < 'M') {
				callTime += 6;
			}else if(numCh < 'P') {
				callTime += 7;
			}else if(numCh < 'T') {
				callTime += 8;
			}else if(numCh < 'W') {
				callTime += 9;
			}else if(numCh < '[') {
				callTime += 10;
			}else {
				// Z보다 큰 문자는 입력 불가능 바로 반복문을 끝낸다.
				break;
			}
		}
		
		bw.write(String.valueOf(callTime));
		bw.flush();
		br.close();
		bw.close();			
	}
}