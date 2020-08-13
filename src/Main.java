import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Window window1 = new Window("standart", 3000, 5, 7);
        Window window2 = new Window("standart", 4000, 7, 5);

        Build house1 = new Build("skyscraper", 50, window1);
        Build house2 = new Build("skyscraper", 22, window2);
        Build house3 = new Build("skyscraper", 30, window1);

//        System.out.println("window1.hashCode() = " + window1.hashCode());
//        System.out.println("window2.hashCode() = " + window2.hashCode());
//        System.out.println("house1.hashCode() = " + house1.hashCode());
//        System.out.println("house2.hashCode() = " + house2.hashCode());
//        System.out.println("house1.equals(house2) = " + house1.equals(house2));


        Map<Build, Integer> map = new TreeMap<>();
        map.put(house1, 1);
        map.put(house2, 1);
        map.put(house3,1);

        for (Map.Entry<Build, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
