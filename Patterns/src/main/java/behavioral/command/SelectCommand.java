package behavioral.command;

public class SelectCommand implements Command {
    DataBase dataBase;

    public SelectCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void execute() {
        dataBase.select();
    }
}
