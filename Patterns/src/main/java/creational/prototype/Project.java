package creational.prototype;

public class Project implements Prototype {
    private int id;
    private String projectNAme;
    private String sourceCode;

    public Project(int id, String projectNAme, String sourceCode) {
        this.id = id;
        this.projectNAme = projectNAme;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectNAme() {
        return projectNAme;
    }

    public void setProjectNAme(String projectNAme) {
        this.projectNAme = projectNAme;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectNAme='" + projectNAme + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Object clone() {
        return new Project(id, projectNAme, sourceCode);
    }
}
