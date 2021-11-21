import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoonNo1110_submit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine()); // -> 최초 입력 값
        String returnStr = ""; // -> 반환 String
        int returnInt = -1; // -> 반환 String -> int 로 변환
        int count = 0;
        while (returnInt != input) {

            /* returnStr, retunrInt 최초 초기화 */
            if (count == 0) {
                returnStr = "" + input;
                returnInt = Integer.parseInt(returnStr);
            }

            /* 0보다 작을 경우, 앞에 '0' 추가 */
            if (returnInt >= 0 && returnInt < 10) {
                returnStr = "0" + returnInt;
            } else {
                returnStr = "" + returnInt;
            }

            /* 기존 숫자 분할 및 새로운 숫자 조합 */
            String[] splitStr = returnStr.split(""); // -> input 숫자 좌우 분할
            int left = Integer.parseInt(splitStr[0]); // -> 분할 후 왼쪽 숫자
            int right = Integer.parseInt(splitStr[1]); // -> 분할 후 오른쪽 숫자
            int sumNum = left + right; // -> 합하여 새로운 숫자 생성

            System.out.println("left : " + left);
            System.out.println("right : " + right);
            System.out.println("sumNum : " + sumNum);
            System.out.println("left + right = sumNum >> " + left + " + " + right + " = " + sumNum);

            String newNumright = "";

            if (sumNum > 9) { // -> 합하여 생성된 새로운 숫자가 10보다 클 경우
                String[] splitSum = String.valueOf(sumNum).split("");
                newNumright = splitSum[1]; // -> 분할하여 오른쪽 숫자만 발췌
                System.out.println("newNumright : " + newNumright);
            } else {
                newNumright = sumNum + ""; // -> 10 보다 작을 경우, 그대로 적용.
            }

            returnStr = right + newNumright; // -> 기존 숫자의 앞오른쪽 숫자와, 새로운 숫자의 오른쪽 숫자(또는 숫자 그 자체)를 합한다.
            returnInt = Integer.parseInt(returnStr);

            System.out.println("count : " + count);
            System.out.println("returnInt : " + returnInt);
            System.out.println("return--------------------------");
            count++;
        }
        System.out.println("count : " + count);
    }
}
