import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("this is email message");
    }
}