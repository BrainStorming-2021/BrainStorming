public class CyclicRotation {

    public static void main(String[] args) {
        int[] input = { 5, 2, 3, 9, 1, 4, 6, 7 };
        solution(input, 3);
    }

    public static int[] solution(int[] A, int K) {
        int[] ret = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int idx = (i + K) % A.length;
            System.out.println("idx" + idx);

            ret[idx] = A[i];
        }

        return ret;
    }
}
