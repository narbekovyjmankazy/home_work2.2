import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.deposit(15000);
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a  = scanner.nextInt();
            try {
                user.withDraw(a);
                System.out.println("Деньги сняты со счета Оставшаяся сумма = "+ user.getAmount());
            }catch (LimitException e){
                System.out.println(e.getMessage());
                System.out.println("Оставшаяся сумма = " + e.getRemainingAmount());
                try {
                    user.withDraw(e.getRemainingAmount());
                    System.out.println("Оставшаяся сумма снята Вас счет = " + user.getAmount());
                } catch (LimitException ex){
                    System.out.println("Ошибка = " + ex.getMessage());
                }
                break;
            }
        }
    }
}