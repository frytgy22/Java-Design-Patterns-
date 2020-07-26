package behavioral.chain_of_responsibility;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
