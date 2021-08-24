
public class Main1 {
    public static void main(String[] args) {
        int check = 100;
        int enrollment = 100;
        int bonus;
        if (enrollment > 1000) {
            bonus = (enrollment*1)/100;
        } else {
            bonus = 0;
        }
        int balance = check + enrollment + bonus;
        System.out.println("Баланс: " + balance);
        System.out.println("Бонус: " + bonus);
    }
}
