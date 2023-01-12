package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class While_Basic {

	public static void main(String[] args) throws Exception {
		// while문이 00을 만나면 종료하기!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a, b;

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			if (a + b == 0) {
				break;
			}
			bw.write(a);
		}
		br.close();
		bw.flush();
		bw.close();

	}
}
