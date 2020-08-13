import java.util.Comparator;

public class WindowPriceComparator implements Comparator<Window> {
    @Override
    public int compare(Window o1, Window o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 0;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 1;
        } else {
            return 2;
        }
    }
}