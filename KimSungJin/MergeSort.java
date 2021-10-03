public class MergeSort {
    public static void main(String[] args) {
        /* 기본 구현 예제 A */
        int[] a = new int[] { 27, 10, 12, 20, 25, 13, 15, 22 };
        // int[] asorted = mergeSort(a, 0, a.length - 1);
        // printArray(asorted);

        /* 기본 구현 예제 B */
        int[] b = new int[] { 21, 10, 12, 20, 25, 13, 15, 22 };
        sort(b, 0, b.length);
    }

    /**
     * 기본 구현 형태 A
     * 
     * @param arr   : 정렬할 배열
     * @param start : 시작 index
     * @param end   : 종료 index
     */
    public static int[] mergeSort(int[] arr, int start, int end) {
        int[] sorted = new int[arr.length];
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            int first = start;
            int last = mid + 1;
            int idx = first;

            while (first <= mid || last <= end) {
                if (last > end || (first <= mid && arr[first] < arr[last])) {
                    sorted[idx++] = arr[first++];
                } else {
                    sorted[idx++] = arr[last++];
                }
            }

            for (int i = start; i <= end; i++) {
                arr[i] = sorted[i];
            }

        }
        return arr;
    }

    /* 기본 구현 형태 B */
    /**
     * 배열 출력 메서드
     * 
     * @param arr : 출력할 배열
     */
    public static void printArray(int[] arr) {
        System.out.print("배열 출력 ================> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 분할 메서드
     * 
     * @param arr   : 분할할 배열
     * @param first : 분할 시작 index
     * @param last  : 분할 마지막 index
     */
    public static void sort(int[] arr, int first, int last) {
        System.out.println("sort method : " + first + " / " + last);
        if (last - first < 2) {
            System.out.println("sort method : ============ end");
            return;
        }
        int mid = (first + last) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, last);
        merge(arr, first, mid, last);
    }

    private static void merge(int[] arr, int first, int mid, int last) {

        System.out.println("merge method : " + first + " / " + mid + " / " + last);

        int[] sorted = new int[last - first];
        int start = first;
        int end = mid;
        int idx = 0;

        while (start < mid && end < last) {
            if (arr[start] < arr[end]) {
                sorted[idx++] = arr[start++];
            } else {
                sorted[idx++] = arr[end++];
            }
        }

        while (start < mid) {
            sorted[idx++] = arr[start++];
        }

        while (end < last) {
            sorted[idx++] = arr[end++];
        }

        for (int i = first; i < last; i++) {
            arr[i] = sorted[i - first];
        }

        printArray(sorted);
    }
}
