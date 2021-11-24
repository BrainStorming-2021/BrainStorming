import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoonNo2577_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = String.valueOf(A * B * C);

        System.out.println("A * B * C = " + (A * B * C));
        String[] resultArr = result.split("");

        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eihgt = 0;
        int nine = 0;

        for (String num : resultArr) {
            switch (num) {
            case "0":
                zero++;
                break;
            case "1":
                one++;
                break;
            case "2":
                two++;
                break;
            case "3":
                three++;
                break;
            case "4":
                four++;
                break;
            case "5":
                five++;
                break;
            case "6":
                six++;
                break;
            case "7":
                seven++;
                break;
            case "8":
                eihgt++;
                break;
            case "9":
                nine++;
                break;
            }
        }

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eihgt);
        System.out.println(nine);
    }
}
