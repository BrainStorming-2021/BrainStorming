/**
 * 최대 회의가 가능한 시간 구하기
 */

fun main(){
    var input = readLine()!!.toInt()
    var conference_time = mutableListOf<Pair<Int,Int>>()
    var count = 0
    var endTime = 0
    repeat(input){
        var (first,second) = readLine()!!.split(" ").map { it.toInt() }
        conference_time.add(Pair(first,second))
    }

    conference_time.sortWith(compareBy { it.first })
    conference_time.sortWith(compareBy { it.second })

    conference_time.forEach {
        if(it.first>=endTime){
            count++
            endTime = it.second
        }
    }
    println(count)
    println(conference_time)
}


/* 참고 문헌
sortWith = https://skytitan.tistory.com/184
pair = https://codechacha.com/ko/kotlin-pair-and-triple/
로직 = https://ourjes.tistory.com/8
 */