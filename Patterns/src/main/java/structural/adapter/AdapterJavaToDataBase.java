package structural.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase {
    public void update() {
        updateObject();
    }

    public void insert() {
        saveObject();
    }

    public void select() {
        loadObject();
    }

    public void remove() {
        deleteObject();
    }
}
