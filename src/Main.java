import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean systemOn = true;
        DownloaderMachine machine = new DownloaderMachine();
        while(systemOn){
            System.out.println("Enter a command. To exit the system type: 'quit'.");
            System.out.println("To view available commands type: 'commands'.");
            Scanner in = new Scanner(System.in);
            String action = in.next();
            try{
                switch(action){
                    case "turnOn":
                        machine.turnOn();
                        break;
                    case "turnOff":
                        machine.turnOff();
                        break;
                    case "internetOn":
                        machine.internetOn();
                        break;
                    case "internetOff":
                        machine.internetOff();
                        break;
                    case "fileRequest":
                        System.out.println("Enter the file name you wish to download.");
                        String fileName = in.next();
                        machine.fileRequest(fileName);
                        break;
                    case "fileDelete":
                        System.out.println("Enter the file name you wish to delete.");
                        String fileNameToDelete = in.next();
                        machine.fileDelete(fileNameToDelete);
                        break;
                    case "abortDownload":
                        machine.downloadAborted();
                        break;
                    case "restartMovie":
                        machine.restartMovie();
                        break;
                    case "playMovie":
                        machine.playMovie();
                        break;
                    case "pauseMovie":
                        machine.pauseMovie();
                        break;
                    case "stopMovie":
                        machine.stopMovie();
                        break;
                    case "commands":
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("Available Commands: ");
                        System.out.println("System: turnOn, turnOff, internetOn, internetOff");
                        System.out.println("Files: fileRequest, downloadAborted, downloadError, errorFixed, fileDelete");
                        System.out.println("Movies: movieOn, restartMovie, holdMovie, movieOff, resume");
                        System.out.println("----------------------------------------------------------------------------");
                        break;
                }


            }catch(Exception e){
                e.printStackTrace();
            }
        }


    }

}
