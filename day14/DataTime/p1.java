package day14.DataTime;

import java.time.LocalDate;
import java.time.LocalTime;

class Interview {

    String candidateName;
    LocalDate interviewDate;
    LocalTime interviewTime;
    InterviewStatus status;

    Interview(String candidateName,
              LocalDate interviewDate,
              LocalTime interviewTime,
              InterviewStatus status) {

        this.candidateName = candidateName;
        this.interviewDate = interviewDate;
        this.interviewTime = interviewTime;
        this.status = status;
    }

    void displayInterview() {

        System.out.println("Candidate: " + candidateName);
        System.out.println("Date: " + interviewDate);
        System.out.println("Time: " + interviewTime);
        System.out.println("Status: " + status);
    }
}




class p1 {

    public static void main(String[] args) {

        Interview interview = new Interview(
                "Vanshika",
                LocalDate.of(2026, 10, 10),
                LocalTime.of(14, 30),
                InterviewStatus.SCHEDULED
        );

        interview.displayInterview();
    }
}



