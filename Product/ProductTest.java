public class ProductTest {
    public static void main(String args[]){
        Product p1 = new Product("Apple", 100.50,1);
        Product p2 = new Product("pine", 1009.50,2);
        Product p3 = new Product("orange", 9990.50,3);
        System.out.println("Products are:\n");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("\nMaximun price :\n");
        System.out.println(Product.max(p1,p2,p3));
        System.out.println("\nEdit price of orange:\n");
        p3.setPrice(100);
        System.out.println("\nMaximun price :\n");
        System.out.println(Product.max(p1,p2,p3));
    }
}
