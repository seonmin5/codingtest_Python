import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int groupWordCount = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (checkGroupWord(word)) {
                groupWordCount++;
            }
        }
        sc.close();
        System.out.println(groupWordCount);
    }
    public static boolean checkGroupWord(String word) {
        boolean[] usedAlphabet = new boolean[26];
        char prevChar = ' ';
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar != prevChar) {
                if (usedAlphabet[currentChar - 'a']) {
                    return false;
                }
                usedAlphabet[currentChar - 'a'] = true;
            }
            prevChar = currentChar;
        }
        return true;
    }
}