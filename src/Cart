import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
    private ArrayList<Books> books = new ArrayList();

    //CONSTRUCTOR
    public void addBooks(Books bookInput){
        books.add(bookInput);

        //int i = 0;
        //while (i < books.size()) {
        //    System.out.println(books.get(i));
        //    i++;
        //}


    }



    private double totalInCart = 00.00;
    //ITERATOR
    public double getTotal(){
        Iterator booksIterator = books.iterator();

        while (booksIterator.hasNext()){
            Books book = (Books) booksIterator.next();
            totalInCart += book.getCost();

        }
        return totalInCart;
    }

}
