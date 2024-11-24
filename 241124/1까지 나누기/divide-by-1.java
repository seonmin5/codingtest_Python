import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int i = 1;

        while (n >= 1) {
            n /= i;
            if (n <= 1) {
                break;
            }
            i++;
        }
        System.out.println(i);
        br.close();
    }
}