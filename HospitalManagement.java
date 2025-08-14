
package hospital.management;
import java.util.*;

public class HospitalManagement {
    public static List<Patient> p = new ArrayList<>();
    public static List<Doctor> d = new ArrayList<>();
    public static List<Appointment> app = new ArrayList<>();
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int choice;
    do{
    System.out.println("=> HOSPITAL MANAGEMENT SYSTEM <=");
    System.out.println(" 1 -> Add Patient :");
    System.out.println(" 2 -> Add Doctor :");
    System.out.println(" 3 -> Set Appointment :");
    System.out.println(" 4 -> View Patients :");
    System.out.println(" 5 -> View Doctors :");
    System.out.println(" 6 -> View Appointment :");
    System.out.println(" 7 -> EXIT :");
     System.out.print(" Enter : ");
    choice = sc.nextInt();
    
    switch(choice){
        
            case 1 : addPatient(sc);
            break;
             case 2 : addDoctor(sc); 
            break;
             case 3 :  setAppointment(sc);
            break;
            
             case 4 : viewPatient();
            break;
             case 5 : viewDoctor();
            break;
             case 6 : viewAppointment();
            break;
             default : System.out.println("INVALID CHOICE , TRY AGAIN");
             break;
    }
    } while(choice !=0);
   
    }
  
  public static void addPatient(Scanner sc){
     
        System.out.print("Enter Patient name ");
         String name = sc.next();
         
     System.out.print("Enter Patient gender ");
        String gender = sc.next();
        
         
          System.out.print("Enter Patient age ");
      int age = sc.nextInt();
         
        Patient patient = new Patient(name,age,gender); 
       p.add(patient);
       System.out.println();
        System.out.println("   [ Patient successfully added ]");
        System.out.println();
        System.out.println();
        System.out.println();
        
  }
  
  public static void addDoctor(Scanner sc){
        System.out.println("Enter Doctor name ");
        String name = sc.next();
        
         System.out.println("Enter Doctor speciality ");
         String speciality = sc.next();
         
         
        
        Doctor doctor = new Doctor(name,speciality);
        d.add(doctor);
        System.out.println("Doctor successfully added ");
        System.out.println();
        System.out.println();
        System.out.println();
  }
  
    public static void setAppointment(Scanner sc){
        System.out.println("Enter Date ");
        String date = sc.next();
             System.out.println("Enter Doctor name ");
        String name = sc.next();
        
         System.out.println("Enter Doctor speciality ");
         String speciality = sc.next();
         
         
        
        Doctor doctor = new Doctor(name,speciality);
        
        
             System.out.println("Enter Patient name ");
        String n = sc.next();
        
         System.out.println("Enter Patient gender ");
         String g = sc.next();
         
          System.out.println("Enter Patient age ");
         int age = sc.nextInt();
         
        Patient patient = new Patient(n,age,g); 
        
        Appointment appointment = new Appointment(doctor ,patient,date);
        app.add(appointment);
         System.out.println("appointment successfully set ");
         System.out.println();
        System.out.println();
        System.out.println();
}
    public static void viewPatient(){
        for(Patient pt : p ){
            System.out.print(pt);
        }
         System.out.println();
           System.out.println();
         System.out.println();
        System.out.println();
        System.out.println();
         
    }
    
       public static void viewDoctor(){
        for(Doctor dr : d ){
            System.out.print(dr);
        }
         System.out.println();
         System.out.println();
        System.out.println();
        System.out.println();
    }
       
          public static void viewAppointment(){
        for(Appointment at : app ){
            System.out.print(at);
        }
         System.out.println();
         System.out.println();
        System.out.println();
        System.out.println();
    }
}