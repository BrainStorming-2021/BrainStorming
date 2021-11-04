import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoonNo8393_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int add = 0;

        for (int i = 1; i <= input; i++) {
            add += i;
        }

        System.out.println(add);
    }
}
