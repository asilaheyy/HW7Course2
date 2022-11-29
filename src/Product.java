import java.util.Objects;

public class Product {

    private final String product;

    private final float price;


    public Product(String product, float price) {
        this.product = product;
        if (this.product == null || this.product.isEmpty()) {
            throw new IllegalArgumentException("Укажите продукт");
        }
        this.price = price;
        if (this.price == 0) {
            throw new IllegalArgumentException("Укажите стоимость");
        }

    }

    public String getProduct() {
        return product;
    }

    public float getPrice() {
        return price;
    }




    @Override
    public String toString() {
        return String.format("%s, Цена: %s", this.product, this.price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}

