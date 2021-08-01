/**
 * N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다.
 * 배열에는 홀수의 요소가 포함되며 배열의 각 요소는 쌍으로 구성되지 않은 한 요소를 제외하고
 * 값이 동일한 다른 요소와 쌍을 이룰 수 있습니다.
 *
 * For example, in array A such that:
A[0] = 9  A[1] = 3  A[2] = 9
A[3] = 3  A[4] = 9  A[5] = 7
A[6] = 9
 *
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 *
 * 위의 조건을 충족하는 N개의 정수로 구성된 배열 A가 쌍을 이루지 않은 요소의 값을 반환합니다.
 *
 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 *
 * 위의 예에서 설명한 것처럼 함수는 7을 반환해야 합니다.
 *
 * N is an odd integer within the range [1..1,000,000];
 * each element of array A is an integer within the range [1..1,000,000,000];
 * all but one of the values in A occur an even number of times.
 *
 *
 */
fun main(){
    // 0 = 2, 1 = 3 , 4 = 6
    var arrays = arrayOf(9,3,9,3,7)
    // 자기 자신을 제외한 값이 있는지 확인?
    if(arrays.size==1){
        print(arrays[0])
    }else{
        var rule_check = 0
        run stop@{
            arrays.forEach {
                if(arrays[0] == it && rule_check!=0){
                    return@stop
                }
                rule_check++
            }
        }
        var count_check = rule_check
        var count = 0
        while(true){
            // count와 규칙이 같을 경우 +count_check 를 해준다
            if(count_check==0){
                count = count+rule_check
                count_check = rule_check
            }
            try{
                //count번째 수랑 count+ count_check 의 수가 같지 않으면
                if(arrays[count]!=arrays[count+rule_check]){
                    print(arrays[count])                    //count 번째 수가 문제
                    break
                }
            }catch(e: Exception){
                print(arrays[count])                    //count 번째 수가 문제
                break
            }
            count++
            count_check--
        }
    }
}