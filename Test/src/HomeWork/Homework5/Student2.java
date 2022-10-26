package HomeWork.Homework5;

public class Student2 {
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

class Student2Test{
    public static void main(String[] args){
        HomeWork.Homework5.Student2 FirstStudent = new HomeWork.Homework5.Student2();
        HomeWork.Homework5.Student2 SecondStudent = new HomeWork.Homework5.Student2();
        HomeWork.Homework5.Student2 ThirdStudent = new HomeWork.Homework5.Student2();

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

    }
}