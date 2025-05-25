package searchingSorting;

import pojos.Employee;

import java.util.*;

public class Searching {

    public static void main(String[] args) {
        //array of number sorting
        int arr[] = {1,2,3,232,221,3453,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //array of string sorting
        String [] str = {"Tushar","Sandesh", "Snehal", "Dipu","Vandana"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        //array
        Employee[] emp = new Employee[3];
        emp[0] = new Employee("mandar","Atpadi",29,123);
        emp[1] = new Employee("sandra","pune",93,1232);
        emp[2] = new Employee("nanda","Akluj",39,12223);
        //sort by age
        Arrays.sort(emp,(e1,e2)->Integer.compare(e1.getAge(),e2.getAge()));
        System.out.println(Arrays.toString(emp));
        //sort by name
        Arrays.sort(emp,(e1,e2)->e1.getName().compareTo(e2.getName()));
        for(Employee e:emp){
            System.out.println(e.getName());
        }

        //sort array by location
        Arrays.sort(emp,(e1,e2)-> e1.getLocation().compareTo(e2.getLocation()));
        for(Employee e: emp){
            System.out.println(e.getLocation() +" -> "+ e.getName());
        }
        //List sorting
        List <Integer> ls = new LinkedList<>();
        ls.add(3434);
        ls.add(4344);
        ls.add(2);
        ls.add(5);
        Collections.sort(ls);
        System.out.println(ls);
       // Emp sorting
       List<Employee> empList = new LinkedList<>();
       empList.add(emp[0]);
       empList.add(emp[1]);
       empList.add(emp[2]);
       //emp sort by name
       Collections.sort(empList,(e1,e2)-> e1.getName().compareTo(e2.getName()));
        System.out.println(empList);
       Collections.sort(empList,(e1,e2)-> Integer.compare(e1.getAge(),e2.getAge()));
        System.out.println("******************** Compare by age **********************");
        System.out.println(empList);

        System.out.println("**************sort  employee by salary ***************");
        empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach( em-> System.out.println(em.getName()));

    }

}
