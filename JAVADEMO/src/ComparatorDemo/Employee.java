package ComparatorDemo;

public class Employee {

    private int empid;
    private String name;
    private String phone;

    public Employee(int empid, String name, String phone) {
        this.empid = empid;
        this.name = name;
        this.phone = phone;
    }

    public Employee() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
