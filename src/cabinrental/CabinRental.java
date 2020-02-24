
package cabinrental;

public class CabinRental {
    private int cabinNumber;
    private double rate;
    public CabinRental(int cabinNumber){
        this.cabinNumber = cabinNumber;
        if(cabinNumber >= 1 && cabinNumber <= 3){
            this.rate = 950.00;
        }
        else{
            this.rate = 1100.00;
        }
    }
    public int getCabinNumber(){
        return this.cabinNumber;
    }
    public double getRate(){
        return this.rate;
    }
}
