import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int result = 1;

        for (int i = 1; i <= 10; i++) {
            result *= i;
            if (result >= n) {
                System.out.println(i);
                break;
            }
        }

        br.close();
    }
}