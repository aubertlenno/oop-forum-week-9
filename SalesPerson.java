public class SalesPerson {

    // each object contains details of one salesperson

    private String id;

    private Sales[] salesHistory; // details of the different sales

    private int count = 0; // number of sales made



    //constructor for a new salesperson

    public SalesPerson(String id) {
        this.id = id;
        this.salesHistory = new Sales[100];
    }



    // constructor for a salesperson transferred (together with their sales details) from another branch

    public SalesPerson(String id, Sales[] s, int c){

        // code missing

    }



    public int getCount(){return count;}

    public String getId() {return id;}

    public void setSalesHistory(Sales s){

        salesHistory[count] = s;

        count = count +1;

    }

    public Sales getSalesHistory(int index) {
        return salesHistory[index];
    }



    public double calcTotalSales(){

        // calculates total sales for the salesperson
        double total = 0;

        for(int i = 0; i<count; i++){
            total+=salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return total;
    }



    public Sales largestSale(){

        // calculates the sale with the largest value
        if (count == 0) {
            return null;
        }
        Sales largest = salesHistory[0];
        for (Sales sales : salesHistory) {
            if (sales != null && sales.getValue() > largest.getValue()) {
                largest = sales;
            }
        }
        return largest;

    }

}