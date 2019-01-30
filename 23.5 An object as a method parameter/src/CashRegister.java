public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        this.cashInRegister = 1000;
        economicalSold = 0;
        gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven < 2.50){
            return cashGiven;
        }
        this.cashInRegister += 2.50;
        economicalSold++;
        return cashGiven - 2.50;
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven < 4){
            return cashGiven;
        }
        this.cashInRegister += 4;
        gourmetSold++;
        return cashGiven - 4;
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {
        if(card.balance() < 2.50){
            return false;
        }
        card.pay(2.50);
        this.economicalSold++;
        return true;
    }

    public boolean payGourmet(LyyraCard card) {
        if(card.balance() < 4.00){
            return false;
        }
        card.pay(4.00);
        this.gourmetSold++;
        return true;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum < 0){
            return;
        }
        card.loadMoney(sum);
    }
}