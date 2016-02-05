package Facade;

public class FacadeForScheduleServer{

    private ScheduleServer server;

    //Create constructor
    public FacadeForScheduleServer(ScheduleServer server) {
        this.server = server;
    }

    public void startServer(){
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
    }




}
