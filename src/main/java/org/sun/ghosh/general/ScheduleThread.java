import module java.base;

void main() throws Exception{

 var hyderabadWeatherAPI = "https://api.open-meteo.com/v1/forecast?latitude=17.4065&longitude=78.4772&hourly=temperature_2m&forecast_days=1";

 var hyderabadWeatherURL = new URI(hyderabadWeatherAPI)
                     .toURL();

 Runnable shouldITravel2Hyd = 
    () -> println(fetchURL(hyderabadWeatherURL)); 

 try(var scheduler = 
      Executors.newSingleThreadScheduledExecutor()){

  scheduler.scheduleWithFixedDelay(shouldITravel2Hyd,
   0,
   1,
   TimeUnit.HOURS);

 }
}

public static String fetchURL(URL url) {
    
    try (var in = url.openStream()) {
        String siteContent = new String(in.readAllBytes(),
                StandardCharsets.UTF_8);
        return siteContent;
    } catch (IOException e) {
        e.printStackTrace();
        String returnStr = String.format("The site %s was not fetched " +
                        "due to " +
                        "exception %s, details: %s",
                        url, e.getClass(), e.getMessage());
        return returnStr;
    }
}