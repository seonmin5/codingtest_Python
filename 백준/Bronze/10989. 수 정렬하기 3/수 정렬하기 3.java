import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int n = Integer.parseInt(br.readLine());
        int [] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(arrays);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arrays[i] + "\n");
        }
        System.out.print(sb);
    }
}