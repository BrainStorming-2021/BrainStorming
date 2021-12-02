import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoonNo1065_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int count = 0;

        if (input < 100) {
            count = input;
        } else {
            count = 99;
            for (int i = 100; i <= input; i++) {
                if (99 < i && i < 1000) {
                    int a = i / 100; // 백의 자리
                    int b = (i % 100) / 10; // 10의 자리
                    int c = i % 10; // 1의 자리
                    if (a - b == b - c) {
                        count++;
                    }
                }
                if (999 < i && i < 10000) {
                    int a = i / 1000;
                    int b = (i % 1000) / 100; // 백의 자리
                    int c = (i % 100) / 10; // 10의 자리
                    int d = i % 10; // 1의 자리
                    if (a - b == b - c && b - c == c - d) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

}