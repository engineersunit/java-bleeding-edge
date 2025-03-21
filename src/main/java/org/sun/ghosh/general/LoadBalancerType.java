void main(){

 var backendServersConnMap = new TreeMap<Integer, String>() 
  {{ put( 10, "ServerA"); 
     put( 15, "ServerB"); 
     put( 20, "ServerC"); }};

 while(true){
   
  var leastConnectionServer = backendServersConnMap
                               .pollFirstEntry();

  var servingServer = leastConnectionServer.getValue();
  var connectionHandled = leastConnectionServer.getKey();

  println(String.format(
  "Now serving %d connections: %s", 
  connectionHandled, 
  servingServer));

  while(backendServersConnMap
        .containsKey(connectionHandled+1)){
    connectionHandled++;
  }

 backendServersConnMap.put(
                        connectionHandled+1, 
                        servingServer);
   
 }
}