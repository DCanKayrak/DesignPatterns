package factoryPattern;

public class Main {
    public static void main(String[] args) {

        // Fabrikamızı çağırıyoruz
        ProductFactory productFactory = new ProductFactory();

        // İstediğimiz ürünümüzü fabrikamız vasıtasıyla çağırıyoruz.
        IProduct productX = productFactory.createProduct("X","X ürünüm",1500);
        IProduct productY = productFactory.createProduct("Y","Y ürünüm",3500);

        // Objelerimizi yazdıralım.
        System.out.println(productX);
        System.out.println(productY);
    }
}
