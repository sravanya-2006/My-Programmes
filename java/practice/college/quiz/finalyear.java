package practice.college.quiz;


public class finalyear {
    
    private int RegNo;
    private String Name;
    private int Year;
    private String EventName;

    public finalyear(int RegNo,String Name,int Year,String EventName) {
        this.RegNo = RegNo;
        this.Name = Name;
        this.Year = Year;
        this.EventName = EventName;
    }
    public void enroll(){
        if (EventName.equalsIgnoreCase("Quiz")) {
            System.out.println("You have enrolled for Quiz. Please pay Rs.100.");
        } else if (EventName.equalsIgnoreCase("Code Debugging")) {
            System.out.println("You have enrolled for Code Debugging. Please pay Rs.200.");
        } else {
            System.out.println("Invalid event name.");
        }
    }

    public String getEnrolmentMessage() {
        return "Enrolment successful for " + Name + " of " + Year + " year for " + EventName + " event.";
    }
}
