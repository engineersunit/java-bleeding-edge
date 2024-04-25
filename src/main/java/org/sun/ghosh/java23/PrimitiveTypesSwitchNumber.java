
/**
 * JDK 23
 * OpenJDK JDK 23 Early-Access Builds: https://jdk.java.net/23/
 *
 * JEP 455: Primitive Types in Patterns, instanceof, and switch (Preview)
 * https://openjdk.org/jeps/455
 *
 * Primitive Types used in Switch - Numbers
 */

void main(){
    double compressMe = 100; 
    switch (compressMe) {  // exhaustive switch
        case byte byt ->             // -128 <-> 127
            say("Fits into *byte*!");
        case char c when c < 10 ->   // 0 <-> 65_535
            say("Fits into *char* and is less than 10");
        case short s when s < 100 -> // -32_768 <-> 32_767
            say("Fits into *short* and is less than 100");
        case int i when i < 1_000 -> // -2^31 <-> 2^31 -1
            say("Fits into *int* and is less than 1K");
        case long l when l > 10_000 && l < 1_000_000 -> 
                                     // -2^63 <-> 2^63 -1
            say("Fits into *long* and is between 10K and 1M");
        case float f -> // 1.40239846e-45 <-> 3.40282347e+38
            say("Fits into *float*");
        case double d ->  
        // 4.94065645841246544e-324 <-> 1.79769313486231570e+308
            say("Fits into *double*");
    }
}

private void say(String s){
    System.out.println(s);
}
