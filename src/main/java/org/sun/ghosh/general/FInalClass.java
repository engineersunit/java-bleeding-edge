// https://blogs.oracle.com/javamagazine/category/jm-quiz
// https://blogs.oracle.com/javamagazine/post/java-final-class

final class Job {

    private final int compensation;

    public int getCompensation() {
        return compensation;
    }

    public Job(int compensation) {
        this.compensation = compensation;
    }
}
