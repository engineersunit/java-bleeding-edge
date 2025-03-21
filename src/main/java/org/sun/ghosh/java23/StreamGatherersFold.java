import module java.base;

void main(){

var pa$$w0rd =
/* Generate password from 
   Name and personal details */ 
Stream.of("Sunit", "Ghosh", "01012025", "Java24")
 .gather(Gatherers
          .fold(() -> "#", 
                (pswd, personal) -> 
                 pswd
                 + personal
                     .toUpperCase()
                     .charAt(0)
                 + personal
                     .toLowerCase()
                     .charAt(personal.length()-1)))
 .findFirst();

println(pa$$w0rd.get()); // #StGh05J4

}