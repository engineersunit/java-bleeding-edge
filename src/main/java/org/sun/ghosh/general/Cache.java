void main(){
 
 var pincodeCache = new LinkedHashMap<String, Integer>() {
  @Override 
  protected boolean removeEldestEntry(Map.Entry eldest) {
   return size() > 3; // Max Entries => 3
  }
 };

 pincodeCache.put("Hyderabad", 500_000);
 pincodeCache.put("Mumbai", 400_000);
 pincodeCache.put("Delhi", 110_000);
 // LRU entry "Hyderabad" is removed
 pincodeCache.put("Kolkata", 700_000);

 pincodeCache.forEach((city,pincode) -> println(pincode)); 
 /*
 400000
 110000
 700000
 */
 
 // 0
 println(pincodeCache.getOrDefault("Chennai", 0));
}