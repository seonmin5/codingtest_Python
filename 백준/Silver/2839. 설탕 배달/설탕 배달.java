import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = -1;
        for (int i = n/5; i>=0; i--){
            int remainder = n - i*5;
            if (remainder%3 == 0){
                result = i + remainder/3;
                break;
            }
        }
        System.out.println(result);
    }
}