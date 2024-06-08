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
    long netIncome = 1_00_00_000L; 
    int highTaxPrct = switch (netIncome) { 
        case long l when l <= 7_00_000L -> 0;
        case long l when l <= 9_00_000L -> 10;
        case long l when l <= 12_00_000L -> 15;
        case long l when l <= 15_00_000L -> 20;
        case long l -> 30;
    };
    print("Highest tax slab percent: " + highTaxPrct);
}
