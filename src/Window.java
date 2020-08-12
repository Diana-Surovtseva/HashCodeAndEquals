public class Window {

    private String className;
    private int price;

    public Window(String className, int price) {
        this.className = className;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Window{" +
                "className='" + className + '\'' +
                ", price=" + price +
                '}';
    }
}
