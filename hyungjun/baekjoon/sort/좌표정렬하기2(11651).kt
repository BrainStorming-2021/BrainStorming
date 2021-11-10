import java.lang.StringBuilder

/**
 * 백준 : 좌표정렬하기2 (11651번)
 * 2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 *
 * 입력 : 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다.
 * (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 *
 * 출력 : 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 *
 * 풀이 : y 좌표 정렬하면서 x 좌표도 같이 확인
 */
data class coordinate(var first : Int, var second : Int)

fun main() {
    var num = readLine()!!.toInt()
    var array = ArrayList<coordinate>()
    repeat(num) {
        var (first, second) = readLine()!!.split(" ").map { it.toInt() }
        var inArray = coordinate(first,second)
        array.add(inArray)
    }
    array.sortWith(kotlin.Comparator{ o1,o2 ->
        if(o1.second == o2.second){
            o1.first - o2.first
        }else{
            o1.second-o2.second
        }
    })

    var sb = StringBuilder()
    array.forEach {
        sb.append(it.first).append(" ").append(it.second).append("\n")
    }
    print(sb)
}



