/**
 * 입력 숫자를 거꾸로 했을 경우에 입력 숫자랑 동일할 경우 true 그렇지 않으면 false
 */
fun main(){
    var x = 121

    if(x.toString() == x.toString().reversed()){
        print("true")
    }else{
        print("false")
    }
}