package structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase=new AdapterJavaToDataBase();
        dataBase.insert();
        dataBase.remove();
        dataBase.select();
        dataBase.update();
    }
}
