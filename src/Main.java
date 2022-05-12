public class Main {
    public static void main(String[] args) {
        int initialAccount = -12536;
        int deposit = 1100;
        int bonus = deposit / 100;
        int totalAmount = initialAccount + deposit + bonus;

        if ((initialAccount + deposit) > 1000) {
            System.out.println("Начислено бонусов: " + bonus + ". Текущий баланс: " + totalAmount + ".");
        }
        else {
            System.out.println("Бонусы не начислены. Текущий баланс: " + (initialAccount + deposit));
        }
    }
}