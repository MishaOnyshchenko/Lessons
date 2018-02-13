package sport.sport_goods;


public class Dress {

    private int size;
    private String brand;
    private int price;
    private int count;

    private Info info;

    public Dress(){
    }

    public Dress(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public Dress(int size, String brand, int price) {
        this.size = size;
        this.brand = brand;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}



