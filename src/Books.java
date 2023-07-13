public class Books implements Product {

    private String ISBN;
    private String title;
    private String author1;
    private String author2;
    private String author3;
    private String author4;
    private String author5;
    private String author6;
    private String author7;
    private String author8;
    private String author9;
    private String author10;
    private double cost;
    private String[] bookDetails;



    public Books(String isbnInput, String titleInput, double costInput, String author1Input, String author2Input, String author3Input, String author4Input, String author5Input, String author6Input, String author7Input, String author8Input, String author9Input, String author10Input){

        ISBN = isbnInput;
        title = titleInput;
        cost = costInput;
        author1 = author1Input;
        author2 = author2Input;
        author3 = author3Input;
        author4 = author4Input;
        author5 = author5Input;
        author6 = author6Input;
        author7 = author7Input;
        author8 = author8Input;
        author9 = author9Input;
        author10 = author10Input;

    }

    public Books(String commaSeparatedLine){
        bookDetails = commaSeparatedLine.split(", ");
        ISBN = bookDetails[0];
        title = bookDetails[1];
        cost = Double.parseDouble(bookDetails[2]);
        author1 = bookDetails[3];
        author2 = bookDetails[4];
        author3 = bookDetails[5];
        author4 = bookDetails[6];
        author5 = bookDetails[7];
        author6 = bookDetails[8];
        author7 = bookDetails[9];
        author8 = bookDetails[10];
        author9 = bookDetails[11];
        author10 = bookDetails[12];

    }


    public void printProductDetails() {
        System.out.println("ISBN Number = " + ISBN + "\nTitle: " + title + "\nCost: " + cost + "\nAuthor(s): " + "\n" + author1 + "\n" + author2 + "\n" + author3 + "\n" + author4 + "\n" + author5 + "\n" + author6 + "\n" + author7 + "\n" + author8 + "\n" + author9 + "\n" + author10);

    }

    public double getCost(){
        System.out.println(cost);
        return cost;
    }


}