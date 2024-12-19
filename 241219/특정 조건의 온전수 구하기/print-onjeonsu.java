import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static boolean numberCheck(int number) {
        if (number % 2 == 0 || number % 10 == 5 || (number % 3 == 0 && number % 9 != 0)) {
            return false;
        } else {
            return true;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 1; i <= n; i++) {
            if (numberCheck(i)) {
                System.out.printf("%d ", i);
                }
            }

        br.close();
    }
}