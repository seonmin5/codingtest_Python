import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        int idx = -1;

        for (int i = 0; i < 6; i++) {
            if (c == arr[i]) {
                idx = i;
            }
        }

        if (idx == -1) {
            System.out.println("None");
        } else {
            System.out.println(idx);
        }

        br.close();
    }
}