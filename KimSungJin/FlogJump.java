public class FlogJump {
    public static void main(String[] args) {
        solution(10, 10, 30);

    }

    public static int solution(int X, int Y, int D) {
        int answer = 0;

        if (X == Y) {
            System.out.println("answer = " + answer);
            return answer;
        }
        if (X < Y) {
            int calcu = (Y - X) / D;
            if ((Y - X) % D > 0) {
                answer = calcu + 1;
            } else {
                answer = calcu;
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}