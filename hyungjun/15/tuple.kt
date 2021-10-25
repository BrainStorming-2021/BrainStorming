/**
 * 셀수있는 수량의 순서있는 열거 또는 어떤 순서를 따르는 요소들의 모음을 튜플(tuple)이라고 합니다.
 * n개의 요소를 가진 튜플을 n-튜플(n-tuple)이라고 하며, 다음과 같이 표현할 수 있습니다.
 * (a1, a2, a3, ..., an)
 *
 * 튜플은 다음과 같은 성질을 가지고 있습니다.
 * 1. 중복된 원소가 있을 수 있습니다. ex : (2, 3, 1, 2)
 * 2. 원소에 정해진 순서가 있으며, 원소의 순서가 다르면 서로 다른 튜플입니다. ex : (1, 2, 3) ≠ (1, 3, 2)
 * 3. 튜플의 원소 개수는 유한합니다.
 *
 * 원소의 개수가 n개이고, 중복되는 원소가 없는 튜플 (a1, a2, a3, ..., an)이 주어질 때
 * (단, a1, a2, ..., an은 자연수),
 * 이는 다음과 같이 집합 기호 '{', '}'를 이용해 표현할 수 있습니다.
 * {{a1}, {a1, a2}, {a1, a2, a3}, {a1, a2, a3, a4}, ... {a1, a2, a3, a4, ..., an}}
 * 예를 들어 튜플이 (2, 1, 3, 4)인 경우 이는
 * {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}
 * 와 같이 표현할 수 있습니다. 이때, 집합은 원소의 순서가 바뀌어도 상관없으므로
 * {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}
 * {{2, 1, 3, 4}, {2}, {2, 1, 3}, {2, 1}}
 * {{1, 2, 3}, {2, 1}, {1, 2, 4, 3}, {2}}
 * 는 모두 같은 튜플 (2, 1, 3, 4)를 나타냅니다.
 *
 * 특정 튜플을 표현하는 집합이 담긴 문자열 s가 매개변수로 주어질 때,
 * s가 표현하는 튜플을 배열에 담아 return 하도록 solution 함수를 완성해주세요.
 */
fun main(){
    var s = "{{1,2,3},{2,1},{1,2,4,3},{2}}"
    //문자열을 잘라서 배열로 넣는다.
    var check_s= s.replace("{","")
    var arrays = check_s.substring(0,check_s.length-2).split("},").toMutableList()
    var answer = IntArray(arrays.size,{0})
    var answer_count = 0
    var check_num = ""
    var break_check = true
    while(break_check){
        var del_count = 0
        var count =0
        var check_num = arrays[0]
        arrays.forEach {
            if(check_num.length > it.length){
                check_num = it                      //작은 String 이 들어간다.
                del_count = count                   //check_num 에 들어간 key 값을 del_count에 넣어준다
            }
            count++
        }
        // 1,2,3 등의 값을 list로 변경
        var check_list = arrays[del_count].split(",")   //key
        // 중복 아닌 값을 answer 에 넣어주기
        check_list.forEach {
            if(!answer.contains(it.toInt())){
                answer[answer_count] = it.toInt()
                answer_count++
            }
        }
        // 작은 숫자를 찾는 arrays에서 찾은 코드 삭제하기
        arrays.removeAt(del_count)

        if(!answer.contains(0)){
            break_check=break
        }
    }
    answer.forEach {
        println(it)
    }
}