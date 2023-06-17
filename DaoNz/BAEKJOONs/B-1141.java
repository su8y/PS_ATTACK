import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(rd.readLine());

        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Boolean> check = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String word = rd.readLine();
            if (!arr.contains(word)) {
                arr.add(word);
                check.add(true);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) continue;
                if (arr.get(i).length() < arr.get(j).length()) {
                    int size = arr.get(i).length();
                    if (arr.get(i).equals(arr.get(j).substring(0, size))) {
                        check.set(i, false);
                        break;
                    }
                }
            }
        }

        int res = 0;
        for(Boolean c : check) if (c) res++;
        System.out.print(res);
    }
}
