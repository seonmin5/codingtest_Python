class Solution {
    public int solution(int num1, int num2) {
        // 형 변환
        double result = (double) num1/num2*1000;
        return (int) result;
    }
}