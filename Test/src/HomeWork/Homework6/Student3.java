package HomeWork.Homework6;

public class Student3 {

    Student3(int id2, String name2, String surname2, int year2, double avg_maths2, double avg_economy2, double avg_forlang2) {
        id = id2;
        name = name2;
        surname = surname2;
        year = year2;
        avg_maths = avg_maths2;
        avg_economy = avg_economy2;
        avg_forlang = avg_forlang2;
    }

    Student3(int id2, String name2, String surname2, int year2) {
        id = id2;
        name = name2;
        surname = surname2;
        year = year2;
    }

    Student3(){

    }

    int id;
    String name;
    String surname;
    int year;
    double avg_maths;
    double avg_economy;
    double avg_forlang;
    double avg_mark;

    double avg_mark_student(double maths, double economy, double forlang){
        avg_maths = maths;
        avg_economy = economy;
        avg_forlang = forlang;

        avg_mark = (avg_maths + avg_economy + avg_forlang) / 3;
        return avg_mark;
    }

}

class Student3Test{
    public static void main(String[] args){
        Student3 FirstStudent = new Student3();
        Student3 SecondStudent = new Student3();
        Student3 ThirdStudent = new Student3();
        Student3 FourthStudent = new Student3();
        Student3 FifthStudent = new Student3(4, "Viktor", "Ivanov", 3);
        Student3 SixthStudent = new Student3(5, "Ivan", "Petrov", 2, 2.4, 4.5, 5.0);

        FirstStudent.id = 1;
        FirstStudent.name = "Denis";
        FirstStudent.surname = "Petropavlov";
        FirstStudent.year = 2;

        SecondStudent.id = 2;
        SecondStudent.name = "Petr";
        SecondStudent.surname = "Volkov";
        SecondStudent.year = 3;

        ThirdStudent.id = 3;
        ThirdStudent.name = "Adrian";
        ThirdStudent.surname = "Black";
        ThirdStudent.year = 1;

        System.out.println("First Student:" + FirstStudent.surname + " " + FirstStudent.name);
        System.out.println("Average mark: " + FirstStudent.avg_mark_student(4.5, 4.2, 4.8));

        System.out.println();

        System.out.println("Second Student:" + SecondStudent.surname + " " + SecondStudent.name);
        System.out.println("Average mark: " + SecondStudent.avg_mark_student(4.2, 3.5, 2.5));

        System.out.println();

        System.out.println("Third Student:" + ThirdStudent.surname + " " + ThirdStudent.name);
        System.out.println("Average mark: " + ThirdStudent.avg_mark_student(5.0, 3.8, 4.3));

        System.out.println();

        System.out.println("Fourth Student:" + FourthStudent.surname + " " + FourthStudent.name);

        System.out.println();

        System.out.println("Fifth Student:" + FifthStudent.surname + " " + FifthStudent.name);
        System.out.println("Fifth Student id:" + FifthStudent.id + " year: " + FifthStudent.year);

        System.out.println();

        System.out.println("Sixth Student:" + SixthStudent.surname + " " + SixthStudent.name);
        System.out.println("Fifth Student id:" + SixthStudent.id + " year: " + SixthStudent.year);
        System.out.println("Average mark: " + SixthStudent.avg_mark_student(SixthStudent.avg_maths, SixthStudent.avg_economy, SixthStudent.avg_forlang));
    }
}