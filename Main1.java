public class Main1 {
    public static void main(String[] args) {
        int check = 100;
        int enrollment = 2120;
        int balance = check + enrollment;
        if (enrollment > 1000) {
            balance = check + enrollment + ((enrollment*1)/100);
        }
        System.out.println(balance);
    }
}
//        if (enrollment > 1000) {
//            int balance = check + enrollment + ((enrollment*1)/100);
//            System.out.println(balance);
//        } else {
//            int balance = check + enrollment;
//            System.out.println(balance);
//        }