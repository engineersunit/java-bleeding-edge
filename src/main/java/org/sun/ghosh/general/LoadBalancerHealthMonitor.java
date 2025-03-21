void main(){
var lbMonitor = new LoadBalancerHealthMonitor();

lbMonitor.assignServer("Server_Backup2");
lbMonitor.assignServer("Server_Backup1");
lbMonitor.assignServer("Server2");
lbMonitor.assignServer("Server1");

lbMonitor.unhealthy();
lbMonitor.healthy("Server1");
lbMonitor.unhealthy();
lbMonitor.unhealthy();
print(lbMonitor);
}

class LoadBalancerHealthMonitor{

Deque<String> serverStack = new ArrayDeque<>();

void assignServer(String sname){
    serverStack.addFirst(sname);
}
void unhealthy(){
    serverStack.removeFirst();
}
void healthy(String sname){
    assignServer(sname);
}

@Override
public String toString(){
return serverStack
 .stream()
 .gather(Gatherers
         .fold(() -> "", 
               (s1, s2) -> s1.concat(s2)))
 .findFirst()
 .get();
}
}