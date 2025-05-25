package mocking.beeceptorPojo;




import java.util.List;

public class Teams {
    private String teamName;
    private String project;
    private List<Employees> employees;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teamName='" + teamName + '\'' +
                ", project='" + project + '\'' +
                ", employees=" + employees +
                '}';
    }
}
