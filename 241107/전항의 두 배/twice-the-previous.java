import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            array.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 2; i < 10; i++) {
            int n = array.get(i-1) + (2*array.get(i-2));
            array.add(n);
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", array.get(i));
        }

        br.close();
    }
}