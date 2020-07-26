package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<String, Developer>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            if ("java".equals(speciality)) {
                System.out.println("Hiring Java developer");
                developer = new JavaDeveloper();
            } else if ("c++".equals(speciality)) {
                System.out.println("Hiring C++ developer");
                developer = new CppDeveloper();
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
