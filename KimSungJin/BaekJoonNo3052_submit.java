import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BaekJoonNo3052_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<Integer>();
        /* input 숫자로 배열 생성 */
        for (int i = 0; i < 10; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            int result = inputNum % 42;
            set.add(result);
        }
        System.out.println(set.size());
    }
}
