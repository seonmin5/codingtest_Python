import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        List<Integer> array = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(st.nextToken());
            array.add(n);
        }

        for (int i = 1; i <= 6; i++) {
            int count = Collections.frequency(array, i);
            System.out.printf("%d - %d\n", i, count);
        }

        br.close();
    }
}