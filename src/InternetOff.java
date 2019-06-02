public class InternetOff implements DownloaderStates {

    DownloaderMachine machine;

    public InternetOff(DownloaderMachine machine){
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
        System.out.println("exit internetOff state");
        machine.parallelStates.remove(this);
        machine.internetOn.internetOn();
    }

    @Override
    public void internetOff() {
        System.out.println("enter internetOff state");
        machine.parallelStates.add(this);
    }

    @Override
    public void fileRequest(String filename) {

    }

    @Override
    public void downloadAborted() {

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
