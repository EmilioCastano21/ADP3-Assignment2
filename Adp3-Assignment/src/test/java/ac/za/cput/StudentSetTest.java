package ac.za.cput;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Student Number: 219035709
 * Author: Emilio Castano
 * Date Due: 16/5/2021
 */

class StudentSetTest {

    Set<Student> studentSet = new HashSet<>();

    public void fillSet(){

        for(int i = 0; i < 100; i++){
            String studentNum = "Student" + i;
            Student sn = new Student(studentNum);
            studentSet.add(sn);

        }
    }

    @Test
    //add to Set
    void testAdd(){
        fillSet();
        Student sn = new Student("S101");
        studentSet.add(sn);

        assertEquals(101, studentSet.size());
        System.out.println("Student added to Set");
    }

    @Test
    //remove from Set
    void testRemove(){
        fillSet();
        Boolean isRemoved = studentSet.removeAll(studentSet); //remove
        

        assertEquals(true,isRemoved);
        System.out.println("Students removed from Set");
    }
}