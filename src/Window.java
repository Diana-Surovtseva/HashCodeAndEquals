import java.util.Objects;

public class Window {

    private String className;
    private int price;
    private int length;
    private int width;

    public Window(String className, int price, int length, int width) {
        this.className = className;
        this.price = price;
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return price == window.price &&
                length == window.length &&
                width == window.width &&
                Objects.equals(className, window.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, price, length, width);
    }

    @Override
    public String toString() {
        return "Window{" +
                "className='" + className + '\'' +
                ", price=" + price +
                '}';
    }
}
