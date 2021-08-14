/**
 * 특정 문자열 S 가 주어질 경우 해당 S 를 읽어서 숫자로 반환
 * S는 'one2threezero4' 등 숫자와 영어가 섞여 있음
 */
fun main(){
    var s = "one2threezero4"
    //각 영어에 맞는 숫자를 매핑
    var check_change = mapOf<String,String>(
        Pair("zero","0"),Pair("one","1"),Pair("two","2"), Pair("three","3"),
        Pair("four","4"),Pair("five","5"), Pair("six","6"), Pair("seven","7"),
        Pair("eight","8"), Pair("nine","9"))
    //check_change를 for문으로 돌리면서 s에 해당 영어가 있으면 치환
    for ((k,v) in check_change) {
        if(s.contains(k)){
            s= s.replace(k,v)
        }
    }
    var result = s.toInt()
    print(result)
}
