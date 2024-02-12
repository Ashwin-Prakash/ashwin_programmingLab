public class Product{
    private double price;
    private String name;
    private int pcode;
    Product(String name,double price, int pcode){
        this.name = name;
        this.pcode = pcode;
        this.price = price;
    }
    public static Product max(Product p1,Product p2, Product p3){
        if(p1.price > p2.price){
            if(p1.price>p3.price)
                return p1;
            else
                return p3;
        }else if(p2.price > p3.price)
            return p2;
        else
            return p3;
    }
    public String toString(Product p){
        return "[ Name : " + p.name + " Code : " + p.pcode + " Price : " + p.price + " ]";
    }
}