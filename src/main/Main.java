package main;


import Utils.StudentUtil;
import Utils.Util;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (true) {
            int menu = Util.giveInt("What do you want to do?" +
                    "\n1.Register a Student." +
                    "\n2.Show all Student." +
                    "\n3.Find Student." +
                    "\n4.Update Student." +
                    "\n5.Exit program.");
            if(menu==1){
                StudentUtil.registerStudents();
            } else if (menu == 2) {
                StudentUtil.printAllRegisteredStudents();
            } else if (menu==3) {
               String answer = Util.giveText("How do you want to search Student?  by GPA or by Name Please enter answer.");
               if(answer.equalsIgnoreCase("gpa")){
                   StudentUtil.findStudentByGpa();
               } else if (answer.equalsIgnoreCase("Name")) {
                   StudentUtil.findStudentAndPrint();
               }
            }else if(menu==4){
                StudentUtil.changeUser();

            }else if(menu==5){
                System.out.println("Exiting program.");
                break;
            }
        }

    }
}