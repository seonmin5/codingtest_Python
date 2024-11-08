import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int[] counts = new int[9];
        int n = Integer.parseInt(st.nextToken());
        
        while (n != 0) {
            int division = n / 10;
            if (division >= 1 && division <= 9) {
                counts[division - 1]++;
            }

            if (st.hasMoreTokens()) {
                n = Integer.parseInt(st.nextToken());
            } else {
                break;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%d - %d\n", i + 1, counts[i]);
        }

        br.close();
    }
}