import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[b];
        int result = 0;

        while (a >= 1) {
            int n = a % b;
            arr[n]++;
            a = a / b;
        }

        for (int i = 0; i < b; i++) {
            result += arr[i]*arr[i];
        }

        System.out.print(result);
        br.readLine();
    }
}