public class Brackets {
    public static void main(String[] args) {
        String a = "{[()()]}";
        String b = "([)()]";

        solution(a);
        solution(b);

        System.out.println("a ==> " + solution(a));
        System.out.println("b ==> " + solution(b));
    }

    public static int solution(String s) {
        String[] array = s.split("");

        int half = array.length / 2;
        int full = array.length;

        String left = "";
        String right = "";

        if (full % 2 != 0) {
            return 0;
        }

        for (int i = 0; i < half; i++) {
            left += array[i];
        }

        for (int j = full - 1; half < j; j--) {
            right += array[j];
        }

        System.out.println("left ==> " + left);
        System.out.println("right ==> " + right);

        if (left.equals(right)) {
            return 1;
        }

        return 0;
    }

}