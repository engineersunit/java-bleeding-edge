import module java.base;

void main(){

var dailyTempList =

/* Daily temperature data[]
    Date, min temp, max temp */ 
Stream.of(1,20,30,2,22,34,3,19,29)
 .gather(Gatherers.windowFixed(3))
 .toList();

print(dailyTempList);
//[[1, 20, 30], [2, 22, 34], [3, 19, 29]]

}