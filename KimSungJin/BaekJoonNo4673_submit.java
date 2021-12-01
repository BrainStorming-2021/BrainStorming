import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoonNo4673_submit {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] selfNums = new boolean[10001];
        Arrays.fill(selfNums, Boolean.TRUE);

        for (int i = 1; i < selfNums.length; i++) {
            int input = i;
            int sum = i;
            while (input > 0) {
                sum += (input % 10);
                input /= 10;
            }
            if (sum < selfNums.length) {
                selfNums[sum] = false;
            }
        }

        for (int i = 1; i < selfNums.length; i++) {
            if (selfNums[i] == true) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
