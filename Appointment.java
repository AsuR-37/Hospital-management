package hospital.management;
public class Appointment {
    private static int i = 1000;
    private int aid;
    private Doctor doctor;
    private Patient patient;
    private String date;
    
    public Appointment(Doctor doctor , Patient p , String d){
        aid = i++;
        this.doctor = doctor;
        patient = p;
        date = d;
    }
    public String toString(){
        return "\n\n\nAppointment ID : "+aid+"\n Appointemrnt Details \nPatient : "+patient+"\nDoctor : "+doctor+"\nDate : "+date;
    }
}
