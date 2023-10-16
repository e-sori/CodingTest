import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = "";
		// EOF
		// br.readLine()에서 아무것도 입력하지 않고 엔터를 치면 null이 아니라 빈 값("")이 들어간다.
		// 아무리 엔터를 쳐도 != null과 일치하지 않기 때문에 while문은 계속 돌아간다.
		// ctrl + z로 입력을 종료하면 br.readLine()은 null을 반환한다.
		while((inputStr = br.readLine()) != null) {
			bw.write(inputStr + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();			
	}
}