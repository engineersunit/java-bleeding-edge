void main(){
var relax = isWeekEnd() ^ isTGIF();
println(relax);
}

boolean isWeekEnd(){
    return LocalDate
            .now()
            .getDayOfWeek()
            .name().startsWith("S");
}

boolean isTGIF(){
    return LocalDate
            .now()
            .getDayOfWeek()
            .name().startsWith("F");
}