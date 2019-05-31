public interface DownloaderStates {

    void turnOn();

    void turnOff();

    void internetOn();

    void internetOff();

    void fileRequest();

    void downloadAborted();

    void downloadError();

    void errorFixed();

    void movieOn();

    void restartMovie();

    void holdMovie();

    void moveieOff();

    void resume();


}
