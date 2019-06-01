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

    public DownloaderStates getInternetOn() {
        return internetOn;
    }

    public DownloaderStates getInternetOff() {
        return internetOff;
    }

    public DownloaderStates getNotDownloading() {
        return notDownloading;
    }

    public DownloaderStates getIsDownloading() {
        return isDownloading;
    }

    public DownloaderStates getHasError() {
        return hasError;
    }

    public void turnOn() {
        for (DownloaderStates currState : parallelStates)
            currState.turnOn();
    }

    public void turnOff() {
        for (DownloaderStates currState : parallelStates)
            currState.turnOff();
    }

    public void internetOn() {
        for (DownloaderStates currState : parallelStates)
            currState.internetOn();
    }

    public void internetOff() {
        for (DownloaderStates currState : parallelStates)
            currState.internetOff();
    }

    public void fileRequest() {
        for (DownloaderStates currState : parallelStates)
            currState.fileRequest();
    }

    public void downloadAborted() {
        for (DownloaderStates currState : parallelStates)
            currState.downloadAborted();
    }

    public void downloadError() {
        for (DownloaderStates currState : parallelStates)
            currState.downloadError();
    }

    public void errorFixed() {
        for (DownloaderStates currState : parallelStates)
            currState.errorFixed();
    }

    public void movieOn() {
        for (DownloaderStates currState : parallelStates)
            currState.movieOn();
    }

    public void restartMovie() {
        for (DownloaderStates currState : parallelStates)
            currState.restartMovie();
    }

    public void holdMovie() {
        for (DownloaderStates currState : parallelStates)
            currState.holdMovie();
    }

    public void movieOff() {
        for (DownloaderStates currState : parallelStates)
            currState.movieOff();
    }

    public void resume() {
        for (DownloaderStates currState : parallelStates)
            currState.resume();
    }

    public void playMovie() {
        for (DownloaderStates currState : parallelStates)
            currState.playMovie();
    }

    public void pauseMovie() {
        for (DownloaderStates currState : parallelStates)
            currState.pauseMovie();
    }

    public void stopMovie() {
        for (DownloaderStates currState : parallelStates)
            currState.stopMovie();
    }

}
