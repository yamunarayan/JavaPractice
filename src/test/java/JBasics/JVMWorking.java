package JBasics;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JVMWorking {
    public static void main(String[] args){
        Student obj = new Student();
        Class c = obj.getClass();
        System.out.println(c.getName());
        Method[] m=c.getDeclaredMethods();
        for(Method method:m){
            System.out.println(method.getName());
        }

        Field[] f = c.getDeclaredFields();
        for(Field field:f){
            System.out.println(field.getName());
        }


    }
}

class Student{
    private String studentName;
    private int studentRollno;

    public String getStudentName(){
    return studentName;
    }
    public void setStudentName(String name){
this.studentName=name;
    }
    public int getstudentRollno(){
        return studentRollno;

    }
    public  void setstudentRollno(int rollno){
        this.studentRollno=rollno;

    }
}
