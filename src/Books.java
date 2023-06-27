public class Books {

    private String ISBN;
    private String title;
    private String author;
    private String cost;
    private String[] bookDetails;

    public Books(String isbnInput, String titleInput, String authorInput, String costInput){

        ISBN = isbnInput;
        title = titleInput;
        author = authorInput;
        cost = costInput;

    }

    public Books(String commaSeparatedLine){
        bookDetails = commaSeparatedLine.split(", ");
        ISBN = bookDetails[0];
        title = bookDetails[1];
        author = bookDetails[2];
        cost = bookDetails[3];
    }


    public void printBookDetails() {
        System.out.println("ISBN Number = " + ISBN + "\nTitle: " + title + "\nAuthor: " + author + "\nCost: " + cost);
    }

}