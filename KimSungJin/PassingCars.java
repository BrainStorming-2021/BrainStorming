public class PassingCars {
    public static void main(String[] args) {
        int[] A = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1 };
        solution(A);
    }

    public static int solution(int[] A) {
        int answer = 0;
        int zero = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zero++;
            } else {
                if (zero > 0) { // -> 첫번째 0이 나온 이후 부터 연산 시작.
                    answer += zero;
                }
            }

            System.out.println("idx : " + i + " / value : " + A[i] + " / zero : " + zero + " / answer : " + answer);

        }

        System.out.println("answer : " + answer);

        if (answer > 1000000000 || answer < 0) { // -> 예외 처리 : 문제 요구 사항
            return -1;
        }
        return answer;
    }
}
