package HomeWork.Homework5;

public class Employee {
    int id;
    String Surname;
    int age;
    int salary;
    String Department;

    Employee(int number, String SecondName, int vozrast, int zarplata, String Otdel){
        id = number;
        Surname = SecondName;
        age = vozrast;
        salary = zarplata;
        Department = Otdel;

        System.out.println("Номер сотрудника: "+number);
        System.out.println("Фамилия сотрудника: "+SecondName);
        System.out.println("Возраст сотрудника: "+vozrast);
        System.out.println("Зарплата сотрудника: "+zarplata);
        System.out.println("Департамент сотрудника: "+Otdel);
    }

    int Vdvoe(){
        salary *= 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args){
        Employee employee1 = new Employee(1,
                "Petropavlov",
                24,
                25000,
                "DROP");
        System.out.println("Удвоенная зарплата сотрудника: "+employee1.Vdvoe());

        System.out.println();

        Employee employee2 = new Employee(2,
                "Volkov",
                56,
                236723,
                "DOPIT");
        System.out.println("Удвоенная зарплата сотрудника: "+employee2.Vdvoe());
    }
}
