package com.milan.java8newfeatures.challenge8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
 
    public static void main(String[] args) {
        Tutor tutor = new Tutor();
        Student student = new Student(tutor);
        tutor.setStudent(student);
 
        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });
 
        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });
 
        tutorThread.start();
        studentThread.start();
    }
}
 
class Tutor {
    private Student student;
    private Lock lock = new ReentrantLock();
 
    public synchronized void setStudent(Student student) {
        this.student = student;
    }
 
    public void studyTime() {
        System.out.println("Tutor has arrived");
        try {
            // wait for student to arrive and hand in assignment
            if (lock.tryLock(300, TimeUnit.MILLISECONDS)) {

            }
        }
        catch (InterruptedException e) {
 
        } finally {
            lock.unlock();
        }
        student.startStudy();
        System.out.println("Tutor is studying with student");
    }
 
    public synchronized void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}
 
class Student {
 
    private Tutor tutor;
 
    Student(Tutor tutor) {
        this.tutor = tutor;
    }
 
    public synchronized void startStudy() {
        // study
        System.out.println("Student is studying");
    }
 
    public synchronized void handInAssignment() {
        tutor.getProgressReport();
        System.out.println("Student handed in assignment");
    }
}