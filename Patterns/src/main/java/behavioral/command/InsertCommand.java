package behavioral.command;

public class InsertCommand implements Command {
    DataBase dataBase;

    public InsertCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void execute() {
        dataBase.insert();
    }
}
