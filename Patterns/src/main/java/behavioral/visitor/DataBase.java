package behavioral.visitor;

public class DataBase implements ProjectElement{
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
