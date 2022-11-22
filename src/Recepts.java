import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recepts {

    private Set<Product> products;
    private float calculatePrice;
    private String receptName;

    public Recepts( String receptName,Set<Product> products) {
        this.receptName = receptName;
        this.products = products;
    }

    public float getCost(){
        float calculatePrice = 0;
        for(Product product : products){
            calculatePrice += product.getPrice();
        }
        return calculatePrice;
    }

    public String getReceptName() {
        return receptName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public float getCalculatePrice() {
        return calculatePrice;
    }

    @Override
    public String toString() {
        return receptName + " ингредиенты: "+ products;
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

