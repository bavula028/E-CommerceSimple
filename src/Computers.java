public class Computers implements Product {
    private String serialNumber;
    private String brand; //Examples: HP, Mac, Dell
    private double cost;

    public Computers(String serialNumberInput, String brandInput, double costInput){
        serialNumber = serialNumberInput;
        brand = brandInput;
        cost = costInput;
    }

    public double getCost(){
        return cost;
    }

    public void printProductDetails(){
        System.out.println("Serial No.: " + serialNumber + "\nBrand: " + brand + "\nCost: " + cost);
    }



}
