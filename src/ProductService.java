import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String name){
        for (Product product:
             products) {
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;

    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> productList = new ArrayList<>();
        for (Product product:
             products) {
            String name = product.getName().toLowerCase();
            String type = product.getType().toLowerCase();
            String place = product.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str))
                productList.add(product);
        }
        return productList;
    }
}
