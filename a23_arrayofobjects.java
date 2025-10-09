class student{
    int rollno;
    String name;
    int marks;
}

public class a23_arrayofobjects {
    public static void main(String[] a){
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "Vansh";
        s1.marks = 55;

        student s2 = new student();
        s2.rollno = 2;
        s2.name = "Apollo";
        s2.marks = 99;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "Java";
        s3.marks = 98;

        System.out.println((+ s1.rollno + " : " + s1.name + " : " + s1.marks));
        System.out.println((+ s2.rollno + " : " + s2.name + " : " + s2.marks));
        System.out.println((+ s3.rollno + " : " + s3.name + " : " + s3.marks));

        student studarray[] = new student[3];
        studarray[0]=s1;
        studarray[1]=s2;
        studarray[2]=s3;

        for(int i = 0; i<studarray.length;i++){
            System.out.println(studarray[i].name + " - " + studarray[i].marks);
        }

    }
}
