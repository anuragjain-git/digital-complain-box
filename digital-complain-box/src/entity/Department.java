package entity;

public class Department {
    private String deptName;
    private String description;

    public Department(String deptName, String description) {
        this.deptName = deptName;
        this.description = description;
    }


    public String getDeptName() {
        return deptName;
    }

    public String getDescription() {
        return description;
    }
}