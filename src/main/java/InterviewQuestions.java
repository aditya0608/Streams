import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class InterviewQuestions {
    static List<Employee> empList = Arrays.asList(new Employee("E001", 40, "Ram", 'M', 5000),
            new Employee("E002", 35, "Aheila", 'F', 7000),
            new Employee("E003", 24, "Aukesh", 'M', 9000),
            new Employee("E004", 37, "Rani", 'F', 10000));

    public static void main(String[] args) {
        //consider state as Employee and tweek
        //1-Given a list of state objects, print the state codes.(age)
        //question1();

        //2-Given a list of state objects, print the state codes that begin with M.(names)
        //question2();

        //3-Given a list of state objects, modify names to upper case, and print names whose codes begin with A.
        //question3();

        //4-Given a list of state objects, modify names to upper case, and print names whose codes begin with A and sorted in alphabetical order.
        //question4();

        //5-Given a list of state objects, create a map with code as key and name as value.
        question5();
    }

    private static void question5() {
        empList.stream().collect(Collectors.toMap(e->e.getName(),e->e.getSalary()));

    }

    private static void question4() {
        empList.stream().map(names->names.getName().toUpperCase()).filter(names->names.startsWith("A")).sorted((name1,name2)->name1.compareTo(name2)).collect(Collectors.toList()).forEach(e->{
            System.out.println("names "+ e);
        });
    }

    private static void question3() {
        empList.parallelStream().filter(names->names.getName().startsWith("M")).map(names->names.getName().toLowerCase()).collect(Collectors.toList()).forEach(e->{
            System.out.println("NAMES= "+e);
        });
    }

    private static void question2() {
        empList.stream().filter(names->names.getName().startsWith("M")).collect(Collectors.toList()).forEach(e->{
            System.out.println("Name = "+e.getName());
        });
    }

    private static void question1() {
        empList.stream().map(employee -> employee.getAge()).forEach(System.out::println);

    }
}
