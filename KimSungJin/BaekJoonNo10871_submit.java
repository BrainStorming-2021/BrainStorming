import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoonNo10871_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int size = Integer.parseInt(st.nextToken());
        int pointNo = Integer.parseInt(st.nextToken());
        String[] nums = br.readLine().split(" ");

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(nums[i]);
            if (num < pointNo) {
                bw.write(num + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
