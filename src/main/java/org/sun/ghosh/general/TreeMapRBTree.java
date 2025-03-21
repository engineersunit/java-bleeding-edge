void main(){
//Red-Black tree based NavigableMap implementation    
 var stockPricesTop5 = new TreeMap<Integer, String>() 
  {{ put( 1_301, "RELIANCE IND." ); 
     put( 4_125, "TCS" ); 
     put( 1_636, "HDFC BANK" );
     put( 1_627, "BHARTI AIRTEL" ); 
     put( 1_225, "ICICI BANK" );}};

println("Highest value -> " + stockPricesTop5
                              .lastEntry()
                              .getValue());
println("Lowest value -> " + stockPricesTop5
                              .firstEntry()
                              .getValue());

}