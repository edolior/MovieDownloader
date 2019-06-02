public class NotDownloading implements DownloaderStates {

    DownloaderMachine machine;

    public NotDownloading(DownloaderMachine machine){
        this.machine = machine;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void fileRequest(String filename) {
            machine.parallelStates.remove(this);
            System.out.println("exit notDownlaoding state");
            machine.isDownloading.fileRequest(filename);


    }

    @Override
    public void downloadAborted() {
        System.out.println("enter notDownloading state");
        machine.parallelStates.add(this);
    }

    @Override
    public void downloadError() {
    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void playMovie() {

    }

    @Override
    public void pauseMovie() {

    }

    @Override
    public void stopMovie() {

    }

    @Override
    public void fileDelete(String filename) {

    }
}
