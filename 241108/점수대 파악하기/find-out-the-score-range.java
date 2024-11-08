import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st.nextToken());
        int[] counts = new int [10];

        while (n != 0) {
            int division = n / 10;
            if (division >= 1 && division <= 10) {
                counts[division-1]++;
            }

            if (st.hasMoreTokens()) {
                n = Integer.parseInt(st.nextToken());
            } else {
                break;
            }
        }

        for (int i = 10; i > 0; i--) {
                System.out.printf("%d - %d\n", 10*i, counts[i-1]);
        }

        br.close();
    }
}