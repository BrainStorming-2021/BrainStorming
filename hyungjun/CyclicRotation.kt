/**
 * N개의 정수로 구성된 배열 A가 주어집니다.
 * 배열을 회전하면 각 요소가 한 인덱스로 바로 이동하고
 * 배열의 마지막 요소가 첫 번째 위치로 이동됩니다.
 * 예를 들어 어레이 A = [3, 8, 9, 7, 6]의 회전은 [6, 3, 8, 9, 7]입니다
 * (한 지수씩 오른쪽으로 이동하고 6은 1위로 이동).
 * 목표는 어레이 AK회 회전입니다. 즉, A의 각 요소가 오른쪽 K회 회전합니다.
 * fun solution(A: IntArray, K: Int): IntArray
 * 즉, N개의 정수와 정수 K로 구성된 배열 A가 주어진 경우 배열 A가 K번 회전합니다.
 * N과 K는 [0..100] 범위의 정수입니다
 * 어레이 A의 각 요소는 [-1,000..1,000] 범위의 정수입니다.
 * 솔루션에서는 정확성에 초점을 맞추십시오. 솔루션 성능은 평가의 초점이 되지 않습니다.
 */
fun main() {
    var A = intArrayOf()
    var K = 3
    var L = A.toMutableList()       //값을 변경할 수 있는 List 형태로 수정
    var result : IntArray
    //for 문 ==> K의 값이 0 이 아닐경우와 IntArray 에 공란이 아닐경우
    if(K!=0 && !(A.isEmpty())) {
        for (i in 1..K) {
            var last = L.last()         //마지막 값을 가지고 온다
            L.removeAt(L.lastIndex)     //마지막 값을 삭제한다
            L.reverse()                 //List의 값을 거꾸로 뒤집는다.
            L.add(last)                 // 마지막 값을 추가한다.
            L.reverse()                 //List 값을 거꾸로 뒤집는다.
        }
        result = L.toIntArray()     //IntArray 값으로 바꾼다
    }else{
        result = A                  
    }
    //result 가 retrun 값
    result.forEach {
        println(it)
    }
}