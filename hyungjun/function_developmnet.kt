/**
 * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 *
 * */
// 배포에 필요한 day를 체크 하면서
// 첫번째 기능의 배포날짜들을 확인하면서 배포되는 기능을 count
fun main(){
    var progress = arrayOf(95, 90, 99, 99, 80, 99) // 현재 퍼센트
    var speeds = arrayOf(1, 1, 1, 1, 1, 1)       // 하루에 채워지는 날짜
    var count = 0                           // kotlin 배열의 위치를 잡아주는 count
    var returns = mutableListOf<Int>()
    var days_array = IntArray(progress.count(),{0})    //progress의 사이즈만큼 0으로 초기화
    var returnscount = 0
    var days_count = 0
    // 전체 작업을 돌면서 각 작업의 날짜를 체크
    progress.forEach {
        var now = it.toDouble()
        var days = 0
        // 작업 퍼센트를 체크하면서 완료 날짜를 추출한다.
        while (now < 100){
            now+=speeds[count]
            days++
        }
        days_array[count] = days        //완료 날짜를 days_array 에 넣기

        if(count != 0) {
            //days_count -> 직전 개발하는 날짜
            if (days_array[days_count] >= days_array[count]) { //직전 개발 날짜가 클 수록 완료하는 프로세스 추가
                var a = returns.get(returnscount)
                returns.removeAt(returnscount)
                returns.add(returnscount, ++a)
            } else {
                //직전 개발날짜보다 오늘 날짜가 크면 프로세스를 새로 추가
                days_count = count
                returnscount++
                returns.add(returnscount,1)
            }
        }else{
            // count가 0 이면 하루를 넣는다. // 무조건 하루 이상
            returns.add(0,1)
        }

        count++
    }
    var answer = IntArray(returns.count())
    count = 0
    returns.forEach {
        answer[count] = it
        println(answer[count])
        count++
    }
}
