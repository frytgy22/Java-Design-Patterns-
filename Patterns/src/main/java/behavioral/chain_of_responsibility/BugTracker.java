package behavioral.chain_of_responsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier notifierSimple = new SimpleReportNotifier(Priority.ROUNITE);
        Notifier notifierEmail = new EmailNotifier(Priority.IMPORTANT);
        Notifier notifierSms = new SMSNotifyer(Priority.ASAP);

        notifierSimple.setNextNotifier(notifierEmail);
        notifierEmail.setNextNotifier(notifierSms);

        notifierSimple.notifyManager("Everything is OK", Priority.ROUNITE);
        notifierSimple.notifyManager("Something wrong", Priority.IMPORTANT);
        notifierSimple.notifyManager("Some problem", Priority.ASAP);
    }
}
