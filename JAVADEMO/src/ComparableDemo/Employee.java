package ComparableDemo;

public class Employee implements Comparable<Employee>{

    private int empid;
    private String name;
    private String phone;

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

    public Employee(int empid, String name, String phone) {
        this.empid = empid;
        this.name = name;
        this.phone = phone;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "ComparableDemo.Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.empid-o.empid;
    }
}
