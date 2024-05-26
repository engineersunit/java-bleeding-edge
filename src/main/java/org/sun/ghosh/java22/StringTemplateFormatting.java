import java.time.LocalDate;
import java.time.Period;

record ProfessionalProfile(
    String designation,
    String company,
    LocalDate from,
    LocalDate to) {
    Period duration() {return Period.between(to, from);}
    }
    
void main(){
    String[] headers = new String[]{"Designation", "Company", "Period"};
    ProfessionalProfile[] myProf = new ProfessionalProfile[] {
        new ProfessionalProfile("Humble Engineer",
                                "Verizon",
                                LocalDate.of(2007, 7, 1), 
                                LocalDate.of(2011, 6, 30)),
        new ProfessionalProfile("Senior Principal Engineer",
                                "Oracle",
                                LocalDate.of(2011, 7, 1),
                                LocalDate.now())};
    String professionalProfileTable = STR."""
    \{put(headers[0])} \{put(headers[1])} \{put(headers[2])}
    \{put(myProf[0].designation)} \{put(myProf[0].company)} \{put(myProf[0].duration())}
    \{put(myProf[1].designation)} \{put(myProf[1].company)} \{put(myProf[1].duration())}
    Total Professional Experience: 
    \{put(Period.between(myProf[0].from, myProf[1].to))}
    """;
    System.out.println(professionalProfileTable);
}

private String put(Object o){
    String p = null != o ? o.toString() : "";
    return p.concat(" ".repeat(Math.abs(30 - p.length())));
}