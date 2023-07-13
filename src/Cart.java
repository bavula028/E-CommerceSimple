import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
    private ArrayList<Product> products = new ArrayList();

    //CONSTRUCTOR
    public void addProduct(Product productInput){
        products.add(productInput);

        //int i = 0;
        //while (i < books.size()) {
        //    System.out.println(books.get(i));
        //    i++;
        //}


    }



    private double totalInCart = 00.00;
    //ITERATOR
    public double getTotal(){
        Iterator productsIterator = products.iterator();

        while (productsIterator.hasNext()){
            Product product = (Product) productsIterator.next();
            totalInCart += product.getCost();

        }
        return totalInCart;
    }

}
