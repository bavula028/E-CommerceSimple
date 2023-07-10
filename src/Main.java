public class Main {

    public static void main (String[]args){

        Books javaBook = new Books ("ISBN0001", "How To Program In Java", 20.00, "Sally Smith", " ", " ", " ", " ", " ", " ", " ", " ", " ");

        Books cPlusPlusBook = new Books ("ISBN0002", "How To Program in C++", 19.99, "John Doe", " ", " ", " ", " ", " ", " ", " ", " ", " ");

        Books javaScriptBook = new Books ("ISBN0001, How to program in JavaScript, 19.21, Adam,  ,  ,  ,  ,  ,  ,  ,  ,  ");

        //CART
        Cart myCart = new Cart();
        myCart.addBooks(javaBook);
        myCart.addBooks(cPlusPlusBook);
        myCart.addBooks(javaScriptBook);


        //ITERATOR TEST
        System.out.println("Cart Total: " + myCart.getTotal());





    }

    }

