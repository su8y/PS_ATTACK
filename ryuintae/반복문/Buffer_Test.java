package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Buffer_Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a, b;

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken()); // 입력값 중 첫번째 토큰 저장.
			b = Integer.parseInt(st.nextToken()); // 입력값 중 두번째 토큰 저장.

			bw.write((a + b) + "\n");
		}

		br.close();

		bw.flush();
		bw.close();

	}
}
