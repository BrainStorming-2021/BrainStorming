
public class SortColors {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 0, 0, 1, 2, 1, 2, 0 };
        solution(nums); // 0,0,0,1,1,1,2,2,2
    }

    public static int[] solution(int[] nums) {
        int length = nums.length;
        int[] sorted = new int[nums.length];

        if (length <= 1) {
            return nums;
        }

        int zeroCnt = 0;
        int twoCnt = length - 1;

        for (int num : nums) {
            if (num == 0) {
                sorted[zeroCnt] = 0;
                zeroCnt++;
            } else if (num == 2) {
                sorted[twoCnt] = 2;
                twoCnt--;
            }
        }

        for (int i = zeroCnt; i <= twoCnt; i++) {
            sorted[i] = 1;
        }

        for (int i : sorted) {
            System.out.println("sorted : " + i);
        }
        return sorted;
    }
}