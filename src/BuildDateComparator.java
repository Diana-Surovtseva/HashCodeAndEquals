import java.util.Comparator;

public class BuildDateComparator implements Comparator<Build> {

    @Override
    public int compare(Build o1, Build o2) {
        if (o1.getYear()<2005)
        return 1;
        if(o1.getYear()>=o2.getYear())
            return 2;
        if(o1.getYear()>2018)
            return 3;
    }
}
