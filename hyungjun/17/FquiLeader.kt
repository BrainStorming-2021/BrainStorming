import java.util.*
import java.util.Arrays.copyOfRange

/**
N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다.
이 배열의 리더는 A 요소의 절반 이상에서 발생하는 값입니다.
예
A[0] = 4, A[1] = 3, A[2] = 4
A[3] = 4, A[4] = 4, A[5] = 2
we can find two equi leaders:

0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.

동등 리더는 0 ≤ S < N - 1 및 두 시퀀스 A[0], A[1], A[S +1], A[S +2], ..., A[N -1]가 동일한 값의 리더를 갖는 지수 S입니다.
 */

fun main() {
    var A = arrayOf(4,3,4,4,4,2)
    var B = mutableListOf<Int>()
    var count = 1
    var return_count = 0
    if(A.size !=1) {
        run {
            A.forEach {
                B.add(it)
                var C = A.copyOfRange(count, A.size)
                count++
                if (check_max(B.toList()).get(1) == check_max(C.toList()).get(1)) {
                    if (check_max(B.toList()).get(0) != 0 && check_max(C.toList()).get(0)!=0) {
                        return_count++
                    }
                }
                if (count == A.size/2) {
                    return@run
                }
            }
        }
    }
    println(return_count)
}

fun check_max(A: List<Int>) : MutableList<Int>{
    var max : MutableList<Int> = mutableListOf(0, 0)
    run{
        A.forEach {
            var check = Collections.frequency(A,it)
            if(check>A.size/2){
                max.add(0,1)
                max.add(1,it)
                return@run
            }
        }
    }
    return max
}


/*
Task Score 55%
Correctness 100%
performance 0%
긴 문자열부터는 타임아웃이떠서 망했어요 ㅠㅠ
 */