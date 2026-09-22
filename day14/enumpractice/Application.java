enum ApplicationStatus {
    PENDING,
    ACCEPTED,
    REJECTED
}

class Application {
    public static void main(String[] args) {

        ApplicationStatus status = ApplicationStatus.PENDING;

        //switch case apply kia hai humne isme

        switch (status) {


            case PENDING:
                System.out.println("Application is under review");
                break;

            case ACCEPTED:
                System.out.println("Application accepted");
                break;

            case REJECTED:
                System.out.println("Application rejected");
                break;
        }
    }
}