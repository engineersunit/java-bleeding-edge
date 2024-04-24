/**
 * JDK 23
 * OpenJDK JDK 23 Early-Access Builds: https://jdk.java.net/23/
 *
 * JEP 455: Primitive Types in Patterns, instanceof, and switch (Preview)
 * https://openjdk.org/jeps/455
 *
 * Primitive Types used in Switch - boolean
 */

void main(){
    boolean shouldILearnSomethingNew = true;
    boolean isWeekend = false;

    String surpriseMe = switch(shouldILearnSomethingNew && isWeekend){
        case true -> {
            String version = getJavaBleedingEdgeVersion();
            yield String.format("https://jdk.java.net/%s/", version);
        }
        case false -> {
            String version = getJavaLatestLTSVersion();
            yield String.format("https://jdk.java.net/%s/", version);
        }
    };
    navigate(surpriseMe);
    /* 
    *  Ternary conditional operator (?:) does not support statements {}
    *    JLS reference
           https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.25

    surpriseMe = shouldILearnSomethingNew ? 
    { "https://jdk.java.net/23/";} 
    : "https://jdk.java.net/21/"; 
    */
}

private void navigate(String URL){
    // TODO: open website
    System.out.println(URL);
}

private String getJavaBleedingEdgeVersion(){
    return "23";
}

private String getJavaLatestLTSVersion(){
    return "21";
}
