// JVM Flags
// -XX:+UnlockExperimentalVMOptions 
// -XX:+UseCompactObjectHeaders

void main(){

// Object size: in bytes
// Disbaled: 40
// Enabled: 32

 println("Object size: " + 
  InstrumentationAgent
   .getObjectSize(
    new String[]{"Sunit", 
                 "Ghosh", 
                 "Java24",
                 "Compact",
                 "Headers"}) + 
  " bytes");}



