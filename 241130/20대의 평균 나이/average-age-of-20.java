import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int sum = 0;
        int count = 0;
        while ((line = br.readLine()) != null) {
            int age = Integer.parseInt(line.trim());
            if (age < 20 || age >= 30) {
                break;
            }
            sum += age;
            count++;
        }
        double result = (double) sum / count;
        System.out.printf("%.2f", result);
        br.close();
    }
}