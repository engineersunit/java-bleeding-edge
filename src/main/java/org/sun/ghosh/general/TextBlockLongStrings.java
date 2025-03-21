void main(){
 // https://openjdk.org/jeps/368#New-escape-sequences
 var veryyyLooongUrlll = """
  https://api.open-meteo.com\
  /v1\
  /forecast\
  ?latitude=17.4065\
  &longitude=78.4772\
  &hourly=temperature_2m\
  &forecast_days=1
  """;

  /* Use a trailing \ to escape the 
    new line at the end of a line

    Called \<line-terminator> 
    escape sequence & is only 
    applicable to text blocks
  */
  
  // prints exact URL without new lines
  println(veryyyLooongUrlll);
  //https://api.open-meteo.com/v1/forecast?latitude=17.4065&longitude=78.4772&hourly=temperature_2m&forecast_days=1
}