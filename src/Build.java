import java.util.Objects;

public class Build implements Comparable <Build> {


    private String type;
    private int numberOfStoreys;
    private Window window;

    public Build(String type, int numberOfStoreys, Window window) {
        this.type = type;
        this.numberOfStoreys = numberOfStoreys;
        this.window = window;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Build build = (Build) o;
        return numberOfStoreys == build.numberOfStoreys &&
                Objects.equals(type, build.type) &&
                Objects.equals(window, build.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, numberOfStoreys, window);
    }

    @Override
    public String toString() {
        return "Build{" +
                "type='" + type + '\'' +
                ", numberOfStoreys=" + numberOfStoreys +
                ", window=" + window +
                '}';
    }

    @Override
    public int compareTo(Build o) {
        return numberOfStoreys - o.numberOfStoreys;
    }
}
