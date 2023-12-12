package src.ru.itmo.java.basics.practic2;

public class Shoes {
    private String brand;
    private String model;
    private Double size;
    private int quantityShoes;
    private Long price;

    public Shoes() {
    }

    public Shoes(String brand, String model, Double size, int quantityShoes, Long price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.quantityShoes = quantityShoes;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public int getQuantityShoes() {
        return quantityShoes;
    }

    public void setQuantityShoes(int quantityShoes) {
        this.quantityShoes = quantityShoes;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", quantityShoes=" + quantityShoes +
                ", price=" + price +
                '}';
    }
}
