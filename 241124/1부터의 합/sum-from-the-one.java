import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int i = 0;

        while (n >= result) {
            result += i;
            if (result >= n) {
                break;
            }
            i++;
        }
        System.out.println(i);

        br.close();
    }
}