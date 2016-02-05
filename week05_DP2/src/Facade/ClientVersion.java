package Facade;

public class ClientVersion{
    public static void main(String[] args) {
        ScheduleServerClass serverClass = new ScheduleServerClass();
        FacadeForScheduleServer clientFacade = new FacadeForScheduleServer(serverClass);

        clientFacade.startServer();

        System.out.println("Start working......");
        System.out.println("After work done.........");


        clientFacade.stopServer();


    }


}
