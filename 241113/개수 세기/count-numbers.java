import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int count = 0;
        
        StringTokenizer st2 = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            int j = Integer.parseInt(st2.nextToken());
            if (j == m) {
                count++;
            }
        }

        System.out.print(count);

        br.close();
    }
}