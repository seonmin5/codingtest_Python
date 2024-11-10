import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[10];
        int result = 0;

        while (a >= 1) {
            int n = a % b;
            arr[n]++;
            a = a / b;
        }

        for (int i = 0; i < 10; i++) {
            result += Math.pow(arr[i], 2);
        }

        System.out.print(result);
        br.readLine();
    }
}