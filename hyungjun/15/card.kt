/**
 * 카드 N 을 입력 하여
 * 첫번째 카드를 버리고 두번째는 맨 마지막으로... 반복 하여 마지막 남은 숫자
 *
 * 버린카드부터 print, 마지막 남은 숫자 print
 */
import java.util.*
fun main(){
    var input = readLine()!!.toInt()
    var list = mutableListOf<Int>()
    var queue : Queue<Int> = LinkedList<Int>()
    var value = 1

    //카드 정의하기
    repeat(input){
        queue.add(value)
        value++
    }

    while(queue.size!=1){
        list.add(queue.peek())
        queue.poll()            //poll()맨 앞 데이터 삭제
        queue.add(queue.peek()) //맨 앞 데이터 넣기
        queue.poll()
    }
    list.forEach {
        print("$it ")
    }
    print(queue.peek())
}