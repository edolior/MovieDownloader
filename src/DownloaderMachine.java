import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DownloaderMachine {

    DownloaderStates internetOn;
    DownloaderStates internetOff;
    DownloaderStates notDownloading;
    DownloaderStates isDownloading;
    DownloaderStates hasError;

    List<DownloaderStates> parallelStates = new ArrayList<>();

    enum UserStatus {Beginner, Advanced, Professional};

    double userScore;
    UserStatus userStatus;
    Queue<String> filesPending = new LinkedList<>();

    public DownloaderMachine(){
        this.internetOff = new InternetOff(this);
        this.internetOn = new InternetOn(this);
        this.notDownloading = new NotDownloading(this);
        this.isDownloading = new IsDownloading(this);
        this.hasError = new Error(this);

        this.parallelStates.add(0, this.internetOff);
        this.parallelStates.add(1, this.notDownloading);
    }




}
