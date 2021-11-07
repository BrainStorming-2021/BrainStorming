public class Collatz {
    public static void main(String[] args) {
        solution(6);
        solution(16);
        solution(626331);
    }

    public static int solution(int num) {
        int answer = 0;

        long number = num;
        System.out.println("num : " + num);

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else if (number % 2 != 0) {
                number = number * 3 + 1;
            }
            answer++;
            if (answer >= 500) {
                return -1;
            }
        }

        System.out.println("answer  :  " + answer);
        System.out.println("======================");

        return answer;
    }
}
