import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsRunner {

static ArrayList<Integer> list=new ArrayList<Integer>();
static      List<Employee> empList = Arrays.asList(new Employee("E001", 40, "Ram", 'M', 5000),
        new Employee("E002", 35, "Sheila", 'F', 7000),
        new Employee("E003", 24, "Mukesh", 'M', 9000),
        new Employee("E004", 37, "Rani", 'F', 10000));


    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(-1);
        //filter();
        //count();
        //map();
        //joining();
        //sorted();
        //parallelStream();
        //min();

    }

    private static void parallelStream() {
        list.parallelStream().collect(Collectors.toList()).forEach(System.out::print);
    }

    private static void min() {
        Stream<Integer> stream=list.stream();
        System.out.println(stream.max((num1,num2)->num1.compareTo(num2)).get());
    }

    private static void sorted() {
        Stream<Employee> stream=empList.stream();
        stream.sorted(new CustomComparator()).collect(Collectors.toList()).forEach(System.out::print);

    }

    private static void joining() {
        Stream<Employee> stream=empList.stream();
        System.out.println(stream.map(empList->empList.getName()).collect(Collectors.joining("-->")));
    }

    private static void map() {
        Stream<Employee> stream=empList.stream();
        stream.filter(sex->sex.getSex()=='F').map(empList->empList.getName()).collect(Collectors.toList()).forEach(System.out::println);

    }

    private static void count() {
        Stream<Integer> stream=list.stream();
        System.out.println(stream.filter(ele->ele<0).count());
    }

    public static void filter()
    {
        Stream<Integer> stream=list.stream();
        System.out.println(String.format("ele=%s",stream.filter(ele->ele>=1).collect(Collectors.toList())));
    }


}
