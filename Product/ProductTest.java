public class ProductTest {
    public static void main(String args[]){
        Product p1 = new Product("Apple", 100.50,1);
        Product p2 = new Product("Apple", 100.50,1);
        Product p3 = new Product("Apple", 100.50,1);

        System.out.println(p1);
        System.out.println(Product.max(p1,p2,p3));
    }
}
