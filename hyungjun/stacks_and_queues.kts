/**
다음 조건 중 하나라도 참이면 N자로 구성된 문자열 S가 적절히 중첩된 것으로 간주됩니다.

S가 비어 있습니다.;
S는 "(U)" 또는 "[U] 또는 "{U}" 형식을 갖습니다. 여기서 U는 적절히 중첩된 문자열입니다.;
S의 형식은 "VW"이며, 여기서 V와 W는 올바르게 중첩된 문자열입니다.
예를 들어 문자열 "{[()]}"은(는) 제대로 중첩되었지만 "([))]은 중첩되지 않았습니다.


Write a function:

fun solution(S: String): Int

N자로 구성된 문자열 S가 주어지면
S가 제대로 중첩된 경우 1을 반환하고 그렇지 않은 경우 0을 반환합니다..

예를 들어, S = "{[()]}", 함수가 1을 반환하고 S = "([))]을 반환하면
위에서 설명한 것처럼 함수는 0을 반환해야 합니다..

다음 가정에 대한 효율적인 알고리즘을 작성합니다.:

N is an integer within the range [0..200,000];
문자열 S는 다음 문자로만 구성됩니다.
: "(", "{", "[", "]", "}" and/or ")".
 */

fun main(){
    var S = "{{{{"
    var check = mutableListOf('{','[','(')  // {, [, ( 만 확인하기
    var change = mutableMapOf('{' to '}', '(' to ')', '[' to ']') // {, (, [ 에 해당하는 값을 return
    var result = 1
    var item = mutableListOf<Char>() // 순차적으로 들어오는 값을 넣어두기

    if(S != "")
    {
        run checks@{
            S.forEach {
                // {, [, ( 중 하나가 들어왔는지 확인
                if(check.contains(it)){
                    // {,[,(를 List 에 순차적으로 add
                    item.add(it)
                }else{
                    // List의 마지막 만 가지고 와서 확인
                    if(!item.isEmpty()) {
                        // List 의 마지막 값을 통해서 중첩인지 확인
                        if (it == change.get(item.get(item.size - 1))) {
                            result = 1
                            // 중첩확인 한 마지막 List 삭제
                            item.removeAt(item.size - 1)
                        } else {
                            // 중첩이 아닐경우 stop 하고 결과 값을 0 으로 하고 return
                            result = 0
                            return@checks
                        }
                    }else{
                        // item 이 비있다면 ?? },],) 로 시작하는 값
                        result = 0
                        return@checks
                    }
                }
            }
        }
    }
    if(!item.isEmpty()){
        result =0
    }
    println(result)
}