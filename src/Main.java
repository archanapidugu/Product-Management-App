import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Product p = new Product();
//        System.out.println(p);
        ProductService productService = new ProductService();

        productService.addProduct(new Product("Asus Vivobook 16", "Laptop", "Croma", 2025));
        productService.addProduct(new Product("Lenovo Thinkpad P15", "Laptop", "Office", 2026));
        productService.addProduct(new Product("Logitec Keyboard", "Keyboard", "Croma", 2024));
        productService.addProduct(new Product("Type C Cable", "Cable", "Flipkart", 2024));
        productService.addProduct(new Product("80W Adapter", "Adapter", "Flipkart", 2025));
        productService.addProduct(new Product("Boat Rockerz 255+", "NeckBand", "Amazon", 2023));
        productService.addProduct(new Product("25W Adapter", "Adapter", "Amazon", 2022));

        System.out.println("Print all products");
        List<Product> products = productService.getAllProducts();
//        System.out.println(products);

        for (Product product:
             products) {
            System.out.println(product);
        }

        System.out.println("================================================================================");

        System.out.println("Print a particular product");
        System.out.println(productService.getProduct("80W Adapter"));
        System.out.println(productService.getProduct("hehe"));

        System.out.println("================================================================================");

        System.out.println("Print product with particular text");
        List<Product> productList = productService.getProductWithText("adapter");
        for (Product product:
             productList) {
            System.out.println(product);
        }
    }
}
