void main(){
  IntStream.range(1, 10)
  .boxed()
  .gather(
    Gatherers
     .scan(() -> 1, 
           (fact, next) -> fact * next))
  .forEach(fact -> println(fact));

}