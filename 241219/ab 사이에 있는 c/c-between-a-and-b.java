import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static boolean multipleC(int number, int c) {
        if (number % c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int count = 0;
        br.close();

        for (int i = a; i <= b; i++) {
            if (multipleC(i, c)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}