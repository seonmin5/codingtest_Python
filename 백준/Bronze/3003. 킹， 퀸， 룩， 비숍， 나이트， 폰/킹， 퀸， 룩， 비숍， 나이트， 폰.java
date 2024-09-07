import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chessPieces = {1, 1, 2, 2, 2, 8};
        int[] foundPieces = new int[chessPieces.length];
        for (int i =0; i < chessPieces.length; i++) {
            foundPieces[i] = sc.nextInt();
        }
        for (int i = 0; i < chessPieces.length; i++) {
            int diff = chessPieces[i] - foundPieces[i];
            if (i == chessPieces.length - 1) {
                System.out.println(diff);
            } else {
                System.out.print(diff + " ");
            }
        }
        sc.close();
    }
}