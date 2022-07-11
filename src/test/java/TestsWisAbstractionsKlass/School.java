package TestsWisAbstractionsKlass;

public abstract class School {
    int desk;
   // int chair;
    int student;

    public int classRoom(int student,  int desk) {
        //  int chair = student;
        if (student <= 10 && desk == student) {
            System.out.println("This small classroom for " + student + " students");
        } else {
            if (student <= 20 && desk / 2 <= student) {
                System.out.println("This small classroom for " + student + " students");
            }
            else {
                if (student > 10 && desk != student) ;
                System.out.println("This big classroom for " + student + " students");
            }
        }
        return student;
    }
}
