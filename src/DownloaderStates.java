public interface DownloaderStates {

    void turnOn();

    void turnOff();

    void internetOn();

    void internetOff();

    void fileRequest(String filename);

    void downloadAborted();

    void downloadError();

    void errorFixed();

    void movieOn();

    void restartMovie();

    void holdMovie();

    void movieOff();

    void resume();

    void playMovie();

    void pauseMovie();

    void stopMovie();

    void fileDelete(String filename);


}
