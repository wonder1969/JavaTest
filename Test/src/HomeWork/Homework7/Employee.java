package HomeWork.Homework7;

public class Employee {
    int id;
    public String Surname;
    int age;
    int salary;
    String Department;

    Employee(int id2, String Surname2, int age2, int salary2, String Department2){
        id = id2;
        Surname = Surname2;
        age = age2;
        salary = salary2;
        Department = Department2;

        System.out.println("Номер сотрудника: " + id2);
        System.out.println("Фамилия сотрудника: " + Surname2);
        System.out.println("Возраст сотрудника: " + age2);
        System.out.println("Зарплата сотрудника: " + salary2);
        System.out.println("Департамент сотрудника: " + Department2);
    }

    int Vdvoe(){
        salary *= 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args){
        Employee emp1 = new Employee(1,
                "Petropavlov",
                24,
                25000,
                "DROP");
        System.out.println("Удвоенная зарплата сотрудника: "+emp1.Vdvoe());

        System.out.println();

        Employee emp2 = new Employee(2,
                "Volkov",
                56,
                236723,
                "DOPIT");
        System.out.println("Удвоенная зарплата сотрудника: "+emp2.Vdvoe());
    }
}