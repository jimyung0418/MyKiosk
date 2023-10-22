public class McdonaldsMenu extends Menu{
    int price;

    public McdonaldsMenu(String name, String description, int price) {
        super(name, description);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}