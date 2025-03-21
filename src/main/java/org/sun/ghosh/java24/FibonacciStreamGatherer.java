void main(){

  LongStream.range(1, 90)
   .boxed()
   .gather(fibonacciGatherer())
   .forEach(fib -> println(fib));
 
 }
Gatherer<Long, ?, Long> fibonacciGatherer() {
    
    Supplier<ArrayList<Long>> initializer = ArrayList::new;
    
    Gatherer.Integrator<ArrayList<Long>, Long, Long> integrator =

            (list, _ , downstream) -> {
               
                if (list.isEmpty()){
                    list.add(0l);
                    downstream.push(0l);
                    list.add(1l);
                    return downstream.push(1l);
                }
                else{
                  var fib = list.get(0) + list.get(1);
                  list.add(0, list.get(1));
                  list.add(1, fib);
                  return downstream.push(fib);
                }
            };

    Gatherer<Long, ?, Long> gatherer = Gatherer.ofSequential(initializer, integrator);

    return gatherer;
}