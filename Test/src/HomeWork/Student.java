//Homework Lesson 4
package HomeWork;

public class Student {
    int id;
    String name;
    String surname;
    int year;
    double avg_maths;
    double avg_economy;
    double avg_forlang;
}

class StudentTest{
    public static void main(String[] args){
        Student FirstStudent = new Student();
        Student SecondStudent = new Student();
        Student ThirdStudent = new Student();

        FirstStudent.id = 1;
        FirstStudent.name = "Denis";
        FirstStudent.surname = "Petropavlov";
        FirstStudent.year = 2;
        FirstStudent.avg_maths = 4.5;
        FirstStudent.avg_economy = 4.2;
        FirstStudent.avg_forlang = 4.8;

        SecondStudent.id = 2;
        SecondStudent.name = "Petr";
        SecondStudent.surname = "Volkov";
        SecondStudent.year = 3;
        SecondStudent.avg_maths = 4.2;
        SecondStudent.avg_economy = 3.5;
        SecondStudent.avg_forlang = 2.5;

        ThirdStudent.id = 3;
        ThirdStudent.name = "Adrian";
        ThirdStudent.surname = "Black";
        ThirdStudent.year = 1;
        ThirdStudent.avg_maths = 5.0;
        ThirdStudent.avg_economy = 3.8;
        ThirdStudent.avg_forlang = 4.3;

        System.out.println("First Student:" + FirstStudent.surname + " " + FirstStudent.name);
        System.out.println("Average mark: " +
                (FirstStudent.avg_maths + FirstStudent.avg_economy + FirstStudent.avg_forlang) / 3);

        System.out.println();

        System.out.println("Second Student:" + SecondStudent.surname + " " + SecondStudent.name);
        System.out.println("Average mark: " +
                (SecondStudent.avg_maths + SecondStudent.avg_economy + SecondStudent.avg_forlang) / 3);

        System.out.println();

        System.out.println("Third Student:" + ThirdStudent.surname + " " + ThirdStudent.name);
        System.out.println("Average mark: " +
                (ThirdStudent.avg_maths + ThirdStudent.avg_economy + ThirdStudent.avg_forlang) / 3);

    }
}