package org.mystat.Lebedeva;

//any object, that can clone itself
//если нужно часто дергать объект с БД, чтоб не увеличиапть ресурсы при каждом обращении,
//дернуть объект 1 раз и создавать его клон
public class PrototypeLesson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cache cache = new Cache();
        cache.setStudent(new Student());
        Student student = cache.getStudent();
    }
}

class Student implements Cloneable {
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

class Cache {
    private Student student;

    public Student getStudent() throws CloneNotSupportedException {
        return student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}