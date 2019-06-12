import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> ledger;

    public PromissoryNote(){
        this.ledger = new HashMap<>();
    }

    public void setLoan(String toWhom, double value) {
        this.ledger.put(toWhom, value);
    }

    public Double howMuchIsTheDebt(String whose) {
        if(this.ledger.get(whose) == null){
            return 0.;
        }
        return this.ledger.get(whose);
    }

}
