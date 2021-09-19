package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    static Boolean rt;
    public static boolean insertStudentToDb(Student st){
       try{
           Connection con =Cp.createC();
           String q="insert into students(sname,sphone,sage) values(?,?,?)";
           PreparedStatement pst=con.prepareStatement(q);
           pst.setString(1,st.getStudentName());
           pst.setString(2,st.getStudentPhone());
           pst.setInt(3,st.getStudentAge());
           pst.executeUpdate();
           rt=true;
       }
       catch (Exception e){
           e.printStackTrace();
           rt=false;
       }
       return rt;

    }

    public static boolean deleteStudent(int id) {
        try{
            Connection con =Cp.createC();
            String q="delete from students where sid=?";
            PreparedStatement pst=con.prepareStatement(q);
            pst.setInt(1,id);

            pst.executeUpdate();
            rt=true;
        }
        catch (Exception e){
            e.printStackTrace();
            rt=false;
        }
        return rt;

    }

    public static void displayAll() {
        try{
            Connection con =Cp.createC();
            String q="select * from students";
            Statement pst =con.createStatement();
            ResultSet set= pst.executeQuery(q);
            while (set.next()){
                int id =set.getInt(1);
                String name=set.getString(2);
                String phone=set.getString(3);
                int age=set.getInt(4);
                System.out.println("Id: "+id);
                System.out.println("Name: "+name);
                System.out.println("Phone No : "+phone);
                System.out.println("Age: "+age);
                System.out.println("#########################");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
