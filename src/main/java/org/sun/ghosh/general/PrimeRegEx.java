void main(String... primeNumber){
print(
 Pattern
  .compile("^.?$|^(..+?)\\1+$")
  .matcher("1"
            .repeat(Integer
                     .valueOf(
                      primeNumber[0])))
  .find()
? "Not Prime" : "Prime");}