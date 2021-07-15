package entities;

public class Individual extends TaxPayer{
    
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    
    
    
    

    @Override
    public final double tax() {
        
        double sum;
        if(getAnualIncome() < 20000){
                   sum = getAnualIncome() * 0.15;
                }
        else {
            sum = getAnualIncome() * 0.25;
            
        }
       
            sum -= getHealthExpenditures() * 0.5;
            if(sum < 0.0){
                sum = 0.0;
                
                
            
        }
        
     return sum;
                   
    }
    
    
    
}
