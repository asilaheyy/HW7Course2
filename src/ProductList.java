import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {

    private final Set<Product> set = new HashSet<>();

    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        if (this.set.contains(product)) {
            throw new IllegalArgumentException();
        } else {
            this.set.add(product);
        }
    }


    public void removeProduct(String product) {
        Iterator<Product> productIterator = this.set.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getProduct().equals(product)) {
                productIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов: ").append('\n');
        for (Product product : this.set) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}
