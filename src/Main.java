public class Main {

    public static void main (String[]args){

        Books book1 = new Books ("ISBN0001", "How To Program In Java", "John Doe", "20.00");


        Books book2 = new Books ("ISBN0002", "How To Program in C++", "Sally Smith", "19.99");

        Books lineFormat = new Books ("ISBN0001, How to program in Java, John Doe, 19.21");
        lineFormat.printBookDetails();
    }

    }

