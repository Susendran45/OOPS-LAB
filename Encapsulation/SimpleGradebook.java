class Student {
private String name;
private int grade1;
private int grade2;
private int grade3;
public Student(String name) {
this.name = name;
this.grade1 = -1;
this.grade2 = -1;
this.grade3 = -1;
}
public void setGrade(int whichGrade, int score) {
if (score < 0 || score > 100) {
System.out.println("Invalid grade! Use 0-100");
return;
}
switch (whichGrade) {
case 1: grade1 = score; break;
case 2: grade2 = score; break;
case 3: grade3 = score; break;
default: System.out.println("Use 1, 2 or 3 for grade slots");
}
}
public double getAverage() {
int count = 0;
int sum = 0;
if (grade1 != -1) { sum += grade1; count++; }
if (grade2 != -1) { sum += grade2; count++; }
if (grade3 != -1) { sum += grade3; count++; }
if (count == 0) return 0;
return (double)sum / count;
}
public String getName() {
return name;
}
public void showGrades() {
System.out.println(name + "'s grades:");
if (grade1 != -1) System.out.println("Grade 1: " + grade1);
if (grade2 != -1) System.out.println("Grade 2: " + grade2);
if (grade3 != -1) System.out.println("Grade 3: " + grade3);
}
}
public class SimpleGradebook {
public static void main(String[] args) {
Student s = new Student("Alex");
s.setGrade(1, 85);
s.setGrade(2, 92);
s.setGrade(3, 78);
s.setGrade(1, 105);
s.showGrades();
System.out.println("Average: " + s.getAverage());
}
}