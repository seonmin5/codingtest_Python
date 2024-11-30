import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        while (count < 3) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 0) {
                System.out.println(n / 2);
                count++;
            }
        }

        br.close();
    }
}