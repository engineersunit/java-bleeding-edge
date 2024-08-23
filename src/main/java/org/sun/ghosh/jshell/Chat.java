import java.net.URI;
import java.util.ArrayList;
import java.util.Map;

import com.fasterxml.jackson.jr.ob.JSON;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

static final URL url = new URI("https://java.oraclecloud.com/currentJavaReleases").toURL();
static final Map<String, Object> result = JSON.std.mapFrom(url);
@SuppressWarnings({ "rawtypes", "unchecked" })
static final ArrayList releases = ((ArrayList)(result.get("items")));


public static String $(String s){
    var query = s.toLowerCase();    
    if(query.contains("latest"))
    {
        var latest = releases.stream().findFirst().get(); 
        return ((Map)latest).get("releaseVersion").toString();
    }
    else if(query.contains("all"))
    {
        return releases.stream().map(javaRelease -> ((Map)javaRelease).get("releaseVersion")).collect(Collectors.toList()).toString();
    }
    else if(query.contains("oldest active"))
    {
        return ((List)(releases.stream().map(javaRelease -> ((Map)javaRelease).get("releaseVersion")).collect(Collectors.toList()))).getLast().toString();
    }
    return "Hello";
    }

