import java.util.Scanner;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mukesh.project.bo.Student;
import com.mukesh.project.com.mukesh.project.module.SimpleModule;
import com.mukesh.project.inter.Registrar;
import com.mukesh.project.inter.StudentStore;

public class RunClass {
    public static void main(String[] args) {
        System.out.println("Welcome to the Registration Database App...");
        System.out.println("Person ID? ");
        Scanner scanner = new Scanner(System.in);
        Integer personId = new Integer(scanner.nextLine());
        scanner.close();
//TODO use mysql for storage instead of hashMap.
        System.out.printf("You supplied Person ID %d searching...\n", personId);

        Injector injector = Guice.createInjector(new SimpleModule());
        StudentStore studentStore = injector.getInstance(StudentStore.class);
        Registrar registrar = injector.getInstance(Registrar.class);

        Student s = new Student();
        s.setId(personId);
        s.setCredits(12);
        studentStore.save(s);

        boolean status = registrar.checkStudentStatus(personId);

        if (status) {
            System.out.println("This student is currently enrolled and meets " + "the registrar's criteria");
        } else {
            System.out.println("This student does not meet the registrar's criteria");
        }

    }
}
