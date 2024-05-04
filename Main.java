import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(12, 6);
        System.out.println("Results: " + result);

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Results: " + result);
    }
}
