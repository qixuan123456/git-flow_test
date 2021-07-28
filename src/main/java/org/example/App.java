package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Teacher teacher = new Teacher(1,"小刚","男",15);
        Student student = new Student(1,"小红","女",30);
        teacher.teach();
        student.study();
    }
}
