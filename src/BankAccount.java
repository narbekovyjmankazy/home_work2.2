public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount += sum;
    }
    public double withDraw(double sum)throws LimitException{
        if(sum > amount){
            throw new LimitException("Ошибка недостаточно денег на счете " + " Вас счет- ", amount);
        }
        return amount -= sum;
    }

}
