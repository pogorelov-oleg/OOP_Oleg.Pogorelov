import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassFile;
import Model.ModelClassList;
import Model.ModelClassHash;
import Model.Core.Student;
import View.ViewRusClass;
import View.ViewEngClass;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> studentsRus = new ArrayList<>();
        Student s1 = new Student("Сергей", 21);
        Student s2 = new Student("Андрей", 25);
        Student s3 = new Student("Иван", 23);
        Student s4 = new Student("Дарья", 24);
        studentsRus.add(s1);
        studentsRus.add(s2);
        studentsRus.add(s3);
        studentsRus.add(s4);

        List<Student> studentsEng = new ArrayList<>();
        Student s5 = new Student("John", 23);
        Student s6 = new Student("Bob", 22);
        Student s7 = new Student("Anna", 24);
        studentsEng.add(s5);
        studentsEng.add(s6);
        studentsEng.add(s7);
        
        // List<Student> students = new ArrayList<>();
        // Student s8 = new Student("Света", 22);
        // Student s9 = new Student("Игорь", 21);
        // Student s10 = new Student("Мария", 21);
        // students.add(s8);
        // students.add(s9);
        // students.add(s10);
     
        iGetModel modelListRus = new ModelClassHash(studentsRus);
        iGetModel modelListEng = new ModelClassList(studentsEng);
        // iGetModel modelFile = new ModelClassFile("StudentDB.csv"); 
        // ModelClassFile mFile = (ModelClassFile) modelFile;
        // mFile.saveAllStudentToFile(students);
        
        List<iGetView> view = new ArrayList<>();
        iGetView viewRus = new ViewRusClass();
        iGetView viewEng = new ViewEngClass();
        view.add(viewRus);
        view.add(viewEng);

        ControllerClass controller = new ControllerClass(view);
        controller.add(modelListRus);
        controller.add(modelListEng);

        controller.run();

    }
}