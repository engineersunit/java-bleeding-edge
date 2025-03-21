import static java.io.IO.println;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Gatherer;

<E> Gatherer<E, ?, E> collapseValues() {
    
    Supplier<ArrayList<E>> initializer = ArrayList::new;
    
    Gatherer.Integrator<ArrayList<E>, E, E> integrator =

            (list, next, downstream) -> {
               
                if (list.isEmpty()){
                    list.add(next);
                    return downstream.push(next);
                }

                if (next.equals(list.getLast())) {
                    return true;
                }
                else {
                    list.add(next);
                    return downstream.push(next);
                }
            };

    Gatherer<E, ?, E> gatherer = Gatherer.ofSequential(initializer, integrator);

    return gatherer;
}

void main(){

 int[] sensorVals = 
  {
   27, 
   30, 30, 
   31, 31, 31, 
   30, 
   27
  };

 var anomalyOptimizedData = 
  Arrays.stream(sensorVals)
        .boxed()
        .gather(collapseValues())
        .toArray();

 Arrays.stream(anomalyOptimizedData)
       .forEach(v -> println(v));
 // Optimized: [27, 30, 31, 30, 27]

}