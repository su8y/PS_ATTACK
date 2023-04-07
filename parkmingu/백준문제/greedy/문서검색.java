package parkmingu.백준문제.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문서검색 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();

        int doc_l = doc.length();
        int word_l = word.length();

        doc = doc.replace(word, "");
        // 원래 문자열 - replace로 word문자들을 빼고 남은 문자열의 길이 / word = word의 개수가 된다
        System.out.println((doc_l - doc.length()) / word_l);
    }
}
