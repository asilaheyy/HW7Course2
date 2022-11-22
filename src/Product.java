import java.util.Objects;

public class Product {

    private final String product;

    private final float price;
    private final float kg;

    private boolean checked;

    public Product(String product, float price, float kg) {
        this.product = product;
        if (this.product == null || this.product.isEmpty()) {
            throw new IllegalArgumentException("Укажите продукт");
        }
        this.price = price;
        if (this.price == 0) {
            throw new IllegalArgumentException("Укажите стоимость");
        }
        this.kg = kg;
        if (this.kg == 0) {
            throw new IllegalArgumentException("Укажите необходимое количество");
        }
        this.checked = false;

    }

    public String getProduct() {
        return product;
    }

    public float getPrice() {
        return price;
    }

    public float getKg() {
        return kg;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = checked;
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Yes" : "No";
        return String.format("%s, Цена: %s, Количество: %s, Куплен: %s", this.product, this.price, this.kg, checkedString);
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

