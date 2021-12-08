import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoonNo11720_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split("");
        int sum = 0;

        for (int i = 0; i < inputSize; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println(sum);
    }
}
