interface AIfy {
 public String generateResponse();    
}

enum Application implements AIfy {

 CHATBOT { 
  public String generateResponse() { 
   return "Hello!"; } },

 REVIEW {
  public String generateResponse() { 
   return "😎 OR 😭"; } };

}

void main(){
 println(Application.CHATBOT.toString() + Application.REVIEW);
}