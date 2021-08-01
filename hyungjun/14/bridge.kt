import java.lang.Exception

/**
 * 트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다.
 * 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다.
 * 다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며,
 * 다리는 weight 이하까지의 무게를 견딜 수 있습니다.
 * 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.
 * 예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다.
 * 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
 * 시간	        다리를 지난 트럭	다리를 건너는 트럭	    대기 트럭
0	        []	            []	                [7,4,5,6]
1~2	        []	            [7]	                [4,5,6]
3	        [7]	            [4]	                [5,6]
4	        [7]	            [4,5]	            [6]
5	        [7,4]	        [5]	                [6]
6~7	        [7,4,5]	        [6]	                []
8	        [7,4,5,6]	    []	                []
 * 매개변수로 다리에 올라갈 수 있는 트럭 수 bridge_length,
 * 다리가 견딜 수 있는 무게 weight
 * 트럭 별 무게 truck_weights가 주어집니다.
 * 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
 *
 * 제한 조건
bridge_length는 1 이상 10,000 이하입니다.
weight는 1 이상 10,000 이하입니다.
truck_weights의 길이는 1 이상 10,000 이하입니다.
모든 트럭의 무게는 1 이상 weight 이하입니다.

 * example
 * 2, 10,[7,4,5,6], 8
 * 100, 100, [10], 101
 * 100, 100, [10,10,10,10,10,10,10,10,10,10], 110
 *
 */
fun main(){
    var bridge_length = 2
    var weight = 10
    var truck_weights = arrayOf(7,4,5,6)
    var truck_bridge = mutableMapOf<Int,Int>()      //트럭마다 bridge_length
    var truck_check = mutableListOf<Int>()          //도착한 트럭 체크
    var count = 0                                   //시간 count
    var array_count = 0                             //올라갈 트럭 체크
    var total_weight = 0                            //다리에 올라간 트럭의 무게
    var truck_bridge_check = 0                      //다리에 올라간 트럭 개수 카운트
    //마지막 트럭이 지나갔을 경우 break
    while(true) {
        count++     //시간은 지나간다...

        var copy_truck = truck_bridge
        // 다리위에 있는 트럭 체크
        if (copy_truck!=null){
            copy_truck.forEach { k, v ->
                var time = v
                time--
                if (time == 0) {
                    truck_check.add(k,truck_weights[k])
                    truck_bridge_check--
                    truck_bridge[k] = -1
                    total_weight = total_weight - truck_weights[k]
                } else {
                    truck_bridge.set(k, time)
                }
            }
        }
        //무게가 적어야한다
        if(array_count<=truck_weights.size-1) {
            if (total_weight+truck_weights[array_count] <= weight && truck_bridge_check < bridge_length
            ) {
                total_weight = total_weight + truck_weights[array_count]
                truck_bridge.set(array_count, bridge_length)
                array_count++
                truck_bridge_check++
            }
        }
        if(truck_check.equals(truck_weights.toList())){
            break
        }
    }
    println(count)
}