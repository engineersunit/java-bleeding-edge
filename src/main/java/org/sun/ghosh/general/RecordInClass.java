import module java.base;

class JobsNowADays{
    
    record SameOldCRUD(
        String businessObject,
        String someInternalFramework) {}
}

class RecordInClass{void main(){
 // How will you initialise the record?
 
 // Option -> A
 var _ = new JobsNowADays
                .SameOldCRUD(
                    "LinkedInProfile",
                    "Spring");

 // Option -> B
 var _ = new JobsNowADays()
                .new SameOldCRUD(
                    "LinkedInProfile",
                    "Spring");   

}}