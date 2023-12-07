package Methods.practice;

public class Practice {
    public static void main(String[] args) {
        practice(args);
        Student joe = new Student("Joe");
        Student jack = new Student("Jack");
        Practice a = new Practice();
        a.bar(joe,jack);
    }
    public static void foo() {
        System.out.println("print this");
    }
    static void practice(String[] args) {
        foo();
    }

    public void bar(Student s1, Student s2){
        System.out.println(s1.getName()+' ' +s2.getName());
    }
}

class Student{
    private String name;
    public Student(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}