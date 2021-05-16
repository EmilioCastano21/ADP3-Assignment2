package ac.za.cput;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapTest {

    Map<Integer, Student> studentMap = new HashMap<>();

    public void fillMap(){

        for(int i = 0; i < 100; i++){
            String studentNum = "Student" + i;
            Student sn = new Student(studentNum);
            studentMap.put(i , sn);

        }
    }

    @Test
    //Add to map
    void testAdd(){
    fillMap();
    Student S100 = new Student("S100");
    studentMap.put(100, S100);

    assertEquals(101, studentMap.size());
        System.out.println("Student added to Map");
    }

    @Test
    //Remove from Map
    void testRemove(){
        fillMap();
        studentMap.remove(36);
        assertEquals(99,studentMap.size());
        System.out.println("Student removed from Map");

    }

    @Test
    //Find In Map
    void testFind(){
        Student S001 = new Student("S001");
        Student S002 = new Student("S002");
        Student S003 = new Student("S003");
        Student S004 = new Student("S004");

        studentMap.put(1, S001);
        studentMap.put(2, S002);
        studentMap.put(3, S003);
        studentMap.put(4, S004);

        Student found = studentMap.get(4);
        System.out.println(studentMap);

        assertEquals(S004, found);
        System.out.println("Student found in Map:");
    }
}




