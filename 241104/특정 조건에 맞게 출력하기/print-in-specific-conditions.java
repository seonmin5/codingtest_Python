import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        ArrayList<Integer> arr = new ArrayList<>();

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            } else if (n % 2 == 1) {
                arr.add(n+3);
            } else {
                arr.add(n/2);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%d ", arr.get(i));
        }

        br.close();
    }
}