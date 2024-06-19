/*
 * Importing the java.base module on-demand would give 
 * immediate access to List, Map, Stream, and Path, without having to 
 * manually import java.util on-demand, and java.util.stream on-demand, 
 * and java.nio.file on-demand.
 */
/*
 import java.util.Map;
 import java.util.function.Function;
 import java.util.stream.Collectors;
 import java.util.stream.Stream; 
*/

import module java.base;

void main(){
    var javaPackages = new String[] { "Map", 
                                      "stream.Stream",
                                      "function.Function",
                                      "stream.Collectors"};
    var packageMap =
    Stream.of(javaPackages)
          .collect(Collectors
                    .toMap(s -> "java.util.".concat(s),
                           Function.identity()));
    print(packageMap);
}