/**
 * 첫 번째에는 입력할 갯수만큼의 숫자를 입력 받는다.
 */
import java.util.*
fun main(){
    var input = readLine()!!.toInt()
    var A = PriorityQueue<Int>(Collections.reverseOrder())  //우선순위가 낮은 것부터 출력(큰 수부터 나옴)
    repeat(input){
        var num = readLine()!!.toInt()
        if(num==0){
            if(A.isEmpty()){
                println(0)
            }
            else{
                println(A.poll())           //poll() 을 이용해서 queue에서 빼낸다
            }
        }else{
            A.add(num)
        }
    }
}