package structural.bridge;

import java.util.Arrays;
import java.util.List;

public class ProgramCreator {
    public static void main(String[] args) {
        List<Program> programs = Arrays.asList(
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        );

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
