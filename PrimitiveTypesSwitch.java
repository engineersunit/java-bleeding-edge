
/**
 * JDK 23
 * OpenJDK JDK 23 Early-Access Builds: https://jdk.java.net/23/
 *
 * JEP 455: Primitive Types in Patterns, instanceof, and switch (Preview)
 * https://openjdk.org/jeps/455
 *
 * Primitive Types used in Switch
 */


void main(){
    boolean shouldILearnSomethingNew = true;

    String surpriseMe = switch(shouldILeanSomethingNew){
        case true -> "https://jdk.java.net/23/";
        case false -> "https://jdk.java.net/21/";
    };
    navigate(surpriseMe);
}

private void navigate(String URL){
    // TODO: open website
    System.out.println(URL);
}
