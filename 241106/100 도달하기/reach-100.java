import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;        
        List<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(n);

        while (result <= 100) {
            int size = array.size();
            result = array.get(size-2) + array.get(size-1);
            array.add(result);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.printf("%d ", array.get(i));
        }

        br.close();
    }
}