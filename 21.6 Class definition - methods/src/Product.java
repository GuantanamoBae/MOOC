public class Product {
    private int amount;
    private double price;
    private String name;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.amount = amountAtStart;
        this.name = nameAtStart;
        this.price = priceAtStart;
    }

    public void printProduct(){
        System.out.println(name + ", price " + price + ", amount " + amount);
    }
}
