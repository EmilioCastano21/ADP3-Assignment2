package ac.za.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    List<Student> studentList = new ArrayList<>();

    public void fillList(){

        for (int i = 0; i <100; i++){
            String studentNum = "Student" + i;
            Student sn = new Student(studentNum);
            studentList.add(sn);

        }
    }

    @Test
    //add to List
    void testAdd(){
        fillList();
        studentList.add(100, new Student("S202"));

        assertEquals(101, studentList.size());
        System.out.println("Student Added to List");
    }

    @Test
    //remove from list
    void testRemove(){
        fillList();
        studentList.remove(23);
        System.out.println(studentList);

        assertEquals(99, studentList.size());
        System.out.println("Student removed from List");
    }

    //@Test
    //void testFind(){}

}