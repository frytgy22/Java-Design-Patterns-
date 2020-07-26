package behavioral.command;

public class UpdateCommand implements Command {
    DataBase dataBase;

    public UpdateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void execute() {
        dataBase.update();
    }
}
