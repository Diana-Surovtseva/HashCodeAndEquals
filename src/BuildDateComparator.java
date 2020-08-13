import java.util.Comparator;

public class BuildDateComparator implements Comparator<Build> {

    @Override
    public int compare(Build o1, Build o2) {
        if (o1.getYear() < o2.getYear()) {
            return -1;
        } else if (o1.getYear() == o2.getYear()) {
            return 0;
        } else return 1;
    }
}