package hospital.management;
public class Patient {
    private static int idCount =1;
    private int id;
    private String name;
    private int age;
    private String gender;
    
    public Patient( String name ,int age , String gender){
        this.id = idCount++;
        this.name = name;
        this.age = age;
        this.gender=gender;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return   "\nPatient ID : "+id+ "\nName : "+name+"\nGender : "+gender+"\nAge : "+age;
    }
}
