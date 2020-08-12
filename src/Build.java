import java.util.Objects;

public class Build {


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
                window == build.window;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfStoreys, window);
    }

}
