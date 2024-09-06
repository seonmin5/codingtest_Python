class Solution {
    public int solution(int n) {
        int result = 0;
        for (int i = n; i>0; i--) {
            if (i%2 == 0) {
                result += i;
            }
        }
        return result;
    }
}