public class ReverseInteger {
    public static void main(String[] args) {
        int a = 123;
        int b = -123;
        int c = 120;
        int d = 0;
        int e = 10;
        int f = -10;
        int g = 1534236469;
        reverse(a);
        reverse(b);
        reverse(c);
        reverse(d);
        reverse(e);
        reverse(f);
        reverse(g);
        reverse_ex(a);
        reverse_ex(b);
        reverse_ex(c);
        reverse_ex(d);
        reverse_ex(e);
        reverse_ex(f);
        reverse_ex(g);
    }

    public static int reverse(int x) {
        int answer = 0;
        // String reverseX = "";

        if (-10 < x && x < 10) {
            answer = x;

        } else if (9 < x) {
            // int m = x;
            // int n = 0;
            // while (0 < m) {
            // n = m % 10;
            // reverseX += n;
            // m = m / 10;
            // }
            // answer = Integer.parseInt(reverseX);
            answer = reverseSolution(x);
        } else if (x < -9) {
            // int m = x * -1;
            // int n = 0;
            // while (0 < m) {
            // n = m % 10;
            // reverseX += n;
            // m = m / 10;
            // }
            // answer = Integer.parseInt(reverseX)*-1;
            answer = reverseSolution(x * -1) * -1;
        }
        System.out.println(x + " : answer ==> " + answer);
        return answer;
    }

    public static int reverseSolution(int x) {
        int answer = 0;
        int m = x;
        int n = 0;
        String re = "";
        while (0 < m) {
            n = m % 10;
            re += n;
            m = m / 10;
        }
        System.out.println("re print : " + re);
        try {
            answer = Integer.parseInt(re);
        } catch (NumberFormatException e) {
            return answer;
        }
        return answer;
    }

    public static int reverse_ex(int x) {
        long res = 0; // -> Integer 를 초과해도 숫자를 담을수 있기 위함.
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            System.out.println(x + "는 Integer 범위를 초과하였습니다.");
            return 0;
        } else {
            System.out.println(x + "의 반전 숫자는 " + (int) res);
            return (int) res;
        }
    }
}