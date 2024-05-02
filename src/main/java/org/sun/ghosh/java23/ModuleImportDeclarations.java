
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream; 
/*
 * Importing the java.base module on-demand would give 
 * immediate access to List, Map, Stream, and Path, without having to 
 * manually import java.util on-demand, and java.util.stream on-demand, 
 * and java.nio.file on-demand.
 */

import module java.base;

void main(){
    String[] javaPackages = new String[] { "Map", 
                                           "stream.Stream",
                                           "function.Function",
                                           "stream.Collectors"};
    Map<String, String> packageMap =
    Stream.of(javaPackages)
          .collect(Collectors
                    .toMap(s -> "java.util.".concat(s),
                           Function.identity()));
    log(packageMap);
}

private void log(Object log){
    System.out.println(log);
}
