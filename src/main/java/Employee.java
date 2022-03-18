import java.util.Comparator;

public class Employee  {
    private String empId;
    private int  age;
    private String name;
    private Character sex;
    private int salary;

    public Employee(String empId, int age, String name, Character sex, int salary)
    {
        this.empId = empId;
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                '}';
    }
}
class CustomComparator implements  Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary()-o2.getSalary();
    }
}