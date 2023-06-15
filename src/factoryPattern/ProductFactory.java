package factoryPattern;

public class ProductFactory {
    public IProduct createProduct(String productType,String productName,double productPrice){
        if(productType.equals("X")){
            return new ProductX(productName,productPrice);
        }else if(productType.equals("Y")){
            return new ProductY(productName,productPrice);
        }else{
            throw new RuntimeException("Geçersiz Ürün Tipi : "+productType);
        }
    }
}
