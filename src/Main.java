public class Main {

    public static void main (String[]args){

        //BOOKS!
        Product javaBook = new Books ("ISBN0001", "How To Program In Java", 20.00, "Sally Smith", " ", " ", " ", " ", " ", " ", " ", " ", " ");

        Product cPlusPlusBook = new Books ("ISBN0002", "How To Program in C++", 19.99, "John Doe", " ", " ", " ", " ", " ", " ", " ", " ", " ");

        Product javaScriptBook = new Books ("ISBN0001, How to program in JavaScript, 19.21, Adam,  ,  ,  ,  ,  ,  ,  ,  ,  ");

        //COMPUTERS!
        Product hpLaptop1 = new Computers ("4CE0460D0G", "HP", 499.99);

        Product hpLaptop2 = new Computers ("5DF0570E0H", "HP", 576.99);

        //CART
        Cart myCart = new Cart();
        myCart.addProduct(javaBook);
        myCart.addProduct(cPlusPlusBook);
        myCart.addProduct(javaScriptBook);
        myCart.addProduct(hpLaptop1);
        myCart.addProduct(hpLaptop2);


        //ITERATOR TEST
        System.out.println("Cart Total: " + myCart.getTotal());





    }

    }

