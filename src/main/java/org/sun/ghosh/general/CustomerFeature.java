import module java.base;

@CustomerFeature(feature=CustomerFeature
                         .Feature
                         .INDOOR_LOCATION)
void newFeatureMethod(){}

@Target({ElementType.METHOD,
    ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface CustomerFeature {

 public Feature feature();

 public enum Feature {
  @EnhancementRequest(
   title="Track indoor location",
   startRelease="25A",
   endRelease="26A")
  INDOOR_LOCATION;
 }

 @Target(ElementType.FIELD)
 @Retention(RetentionPolicy.CLASS)
 @interface EnhancementRequest {
  String title();
  String startRelease();
  String endRelease();
 }
}
void main(){}