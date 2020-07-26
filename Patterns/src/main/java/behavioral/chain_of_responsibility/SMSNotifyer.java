package behavioral.chain_of_responsibility;

public class SMSNotifyer extends Notifier {
    public SMSNotifyer(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Sending sms " + message);
    }
}
