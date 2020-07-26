package behavioral.command;

public class DeleteCommand implements Command {
    DataBase dataBase;

    public DeleteCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void execute() {
        dataBase.delete();
    }
}
