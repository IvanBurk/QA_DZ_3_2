public class Main1 {
    public static void main(String[] args) {
        int check = 100;
        int enrollment = 5120;
        int bonus = (enrollment*1)/100;
        int balance = check + enrollment;
        System.out.println("Баланс: " + balance);
        if (enrollment > 1000) {
            System.out.println("Бонус: " + bonus);
        }
    }
}
//        if (enrollment > 1000) {
//            int balance = check + enrollment + ((enrollment*1)/100);
//            System.out.println(balance);
//        } else {
//            int balance = check + enrollment;
//            System.out.println(balance);
//        }
