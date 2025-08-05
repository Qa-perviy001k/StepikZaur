package Lesson4;

public class Student {

    byte student_card_number;
    String Name_Student;
    String Surname;
    short year_of_study;
    int Average_grade_mathematics;
    int Average_grade_economic;
    int Average_grade_english;
    int AverageRating;

}

class StudentTest {

    public static void main(String[] args) {

        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Studebt3 = new Student();



        Student1.student_card_number = 1;
        Student1.Name_Student = "Василий";
        Student1.Surname = "Морозов";
        Student1.year_of_study = 2025;
        Student1.Average_grade_mathematics = 8;
        Student1.Average_grade_economic = 6;
        Student1.Average_grade_english = 7;
        Student1.AverageRating = (Student1.Average_grade_mathematics + Student1.Average_grade_economic + Student1.Average_grade_english) / 3;

        System.out.println("Студенческий билет: " + Student1.student_card_number);
        System.out.println("Имя Фамилия: " + Student1.Name_Student + " " +  Student1.Surname);
        System.out.println("Год обучения: " + Student1.year_of_study);
        System.out.println("Средняя оценка: " + Student1.AverageRating);
        System.out.println();

        Student2.student_card_number = 2;
        Student2.Name_Student = "Виктор";
        Student2.Surname = "Галицкий";
        Student2.year_of_study = 2023;
        Student2.Average_grade_mathematics = 5;
        Student2.Average_grade_economic = 4;
        Student2.Average_grade_english = 7;
        Student2.AverageRating = (Student1.Average_grade_mathematics + Student2.Average_grade_economic + Student2.Average_grade_english) / 3;

        System.out.println("Студенческий билет: " + Student2.student_card_number);
        System.out.println("Имя Фамилия: " + Student2.Name_Student + " " +  Student2.Surname);
        System.out.println("Год обучения: " + Student2.year_of_study);
        System.out.println("Средняя оценка: " + Student2.AverageRating);




    }


}
