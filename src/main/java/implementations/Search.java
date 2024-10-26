package implementations;

public class Search {
    public String displayProductName(Product productObj){
        if(productObj.getProductList().contains(productObj.getProductName())){
            return productObj.getProductName();
        }
        return null;
    }
}
