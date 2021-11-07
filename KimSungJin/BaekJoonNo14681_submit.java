import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoonNo14681_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        }
    }
}
