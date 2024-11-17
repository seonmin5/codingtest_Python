import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int count = 0;
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            } else {
                count++;
            }
        }

        System.out.println(count);

        br.close();
    }
}