static synchronized void iAmJobReady() {
 
 println("Uncle of LLM");
 println("Nephew of ML");

}

void main() throws InterruptedException{

var _1 = Thread.ofVirtual()
               .start(() -> iAmJobReady());

var _2 = Thread.ofVirtual()
               .start(() -> iAmJobReady());

Thread.sleep(10);
}