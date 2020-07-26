package behavioral.iterator;

public class JavaDeveloper implements Collection {
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int index;

        public boolean hasNext() {
            return index < skills.length;
        }

        public Object next() {
            return skills[index++];
        }
    }
}
