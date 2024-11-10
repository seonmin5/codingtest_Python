import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            String isCold = st.nextToken();
            int degree = Integer.parseInt(st.nextToken());

            if (isCold.equals("Y") && degree >= 37) {
                arr[0]++;
            } else if (isCold.equals("Y") && degree < 37) {
                arr[2]++;
            } else if (isCold.equals("N") && degree >= 37) {
                arr[1]++;
            } else {
                arr[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d ", arr[i]);
        }

        if (arr[0] >= 2) { 
            System.out.print("E");
        }

        br.close();

    }
}