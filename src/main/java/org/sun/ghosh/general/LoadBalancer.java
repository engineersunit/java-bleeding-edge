void main(){

 var backendServers = new LinkedList<String>(
    List.of(
        "ServerA", 
        "ServerB", 
        "ServerC"));

 while(true){

    var server = backendServers.pollFirst();

    println("Now serving:" + server);

    backendServers.offerLast(server);

 }
}