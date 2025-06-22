package practice.college.quiz;

public class Freshers {
    private String registerNumber;
    private String name;
    private int yearOfStudy;
    private String eventName;

    public Freshers(String registerNumber, String name, int yearOfStudy, String eventName) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.eventName = eventName;
    }

    public void enrol() {
        if (eventName.equalsIgnoreCase("Story Narration")) {
            System.out.println("You have enrolled for Story Narration. Please pay Rs.50.");
        } else if (eventName.equalsIgnoreCase("TechTalk")) {
            System.out.println("You have enrolled for TechTalk. Please pay Rs.75.");
        } else {
            System.out.println("Invalid event name.");
        }
    }

    public String getEnrolmentMessage() {
        return "Enrolment successful for " + name + " of " + yearOfStudy + " year for " + eventName + " event.";
    }
}
