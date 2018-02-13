package sport.sport_goods;

public class Boots {
    private int size;
    private String brand;
    private int price;
    private int count;

    private Info info;


    public Boots() {
    }

    public Boots(int size, int price, String brand, int count, Info info) {
        this.size = size;
        this.price = price;
        this.brand = brand;
        this.count = count;
        this.info = info;
    }

    public Boots(int size, String brand, int price) {
        this.size = size;
        this.brand = brand;
        this.price = price;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
