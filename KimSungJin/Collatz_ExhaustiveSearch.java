public class Collatz_ExhaustiveSearch {
    public static void main(String[] args) {
        int a = solution(6);
        System.out.println(a);
    }

    public static int solution(int number) {
        long answer = 0;
        long num = number;
        answer = search(num, answer);
        return Long.valueOf(answer).intValue();
    }

    public static long search(long num, long cnt) {
        if (num == 1) {
            return cnt;
        } else if (num != 1 && cnt == 500) {
            return -1;
        } else if (num != 1 && num % 2 == 0) {
            cnt++;
            return search(num / 2, cnt);
        } else if (num != 1 && num % 2 != 0) {
            cnt++;
            return search(num * 3 + 1, cnt);
        }
        return cnt;
    }
}
