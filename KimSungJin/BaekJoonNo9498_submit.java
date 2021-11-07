import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoonNo9498_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());

        if (input >= 90 && input <= 100) {
            System.out.println("A");
        } else if (input >= 80 && input < 90) {
            System.out.println("B");
        } else if (input >= 70 && input < 80) {
            System.out.println("C");
        } else if (input >= 60 && input < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
