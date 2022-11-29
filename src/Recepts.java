import java.util.*;

public class Recepts {

    private final Map<Product, Integer> products = new HashMap<>();
    private String receptName;

    public Recepts(String receptName) {
        if (receptName == null || receptName.isEmpty()) {
            throw new IllegalArgumentException("");
        }
        this.receptName = receptName;
    }

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0){
            quantity = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + quantity);
        } else {
            this.products.put(product, quantity);
        }

    }

    public float getPrice(){
        float sum = 0;
        for(Map.Entry<Product, Integer> product : this.products.entrySet()){
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }


    public String getReceptName() {
        return receptName;
    }

    @Override
    public String toString() {
        return "Recepts{" +
                "products=" + products +
                ", receptName='" + receptName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recepts recepts = (Recepts) o;
        return Objects.equals(receptName, recepts.receptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptName);
    }
}

