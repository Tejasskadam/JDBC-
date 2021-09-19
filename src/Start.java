import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome");
        while(true){
            System.out.println("press 1 to add student");
            System.out.println("press 2 to delete student");
            System.out.println("press 3 to display student");
            System.out.println("press 4 to exit");
            int c=Integer.parseInt(br.readLine());
            if (c==1){
                //add student
                System.out.println("Enter student name");
                String nm= br.readLine();
                System.out.println("Enter student phone");
                String pn= br.readLine();
                System.out.println("Enter student age");
                int ag=Integer.parseInt(br.readLine());

                Student student=new Student(nm,pn,ag);
                boolean b=StudentDao.insertStudentToDb(student);
                if(b==true){
                    System.out.println("Student added successfully");
                }else {
                    System.out.println("Something went wrong");
                }

            }
            else if (c==2){
                //delete student
                System.out.println("Enter id of student ");
                int id=Integer.parseInt(br.readLine());
                boolean b=StudentDao.deleteStudent(id);
                if (b==true){
                    System.out.println("Deleted Successfully");

                }else {
                    System.out.println("somthing went wrong");
                }



            }
            else if (c==3){
                //display student
                StudentDao.displayAll();



            }
            else if (c==4){
                //exit
                break;

            }
            else{

            }
        }

    }
}
