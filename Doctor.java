package hospital.management;
public class Doctor {
    private static int idCount =1;
      private int id;
      private String name;
      private String speciality;
      
      public Doctor(String name , String speciality){
          id = idCount++;
          this.name = name;
          this.speciality = speciality;
      }
      public int getId(){
          return id;
      }
      public String toString(){
          return   "\nDoctor ID : "+id+ "\nName : "+name+"\nSpeciality : "+speciality;
      }
      
}
