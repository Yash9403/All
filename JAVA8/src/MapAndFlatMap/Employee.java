package MapAndFlatMap;

import java.util.Collections;
import java.util.List;

public class Employee {

    private String name;
    private String phone;
    private List<String> email;

    public Employee() {
    }

    public Employee(String name, String phone, List<String> email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
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

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }
}
