public class Error implements DownloaderStates {

    DownloaderMachine machine;

    public Error(DownloaderMachine machine){
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
        System.out.println("Error occurred.Cannot download files");
    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void downloadError() {
        System.out.println("Error occurred.Cannot download the file");
        this.machine.parallelStates.add(this.machine.hasError);
        if(this.machine.parallelStates.contains(this.machine.isDownloading)){
            this.machine.parallelStates.remove(this.machine.isDownloading);
        }
        this.machine.parallelStates.add(this.machine.notDownloading);
    }

    @Override
    public void errorFixed() {
        System.out.println("Error fixed!");
        this.machine.parallelStates.remove(this);
    }

    @Override
    public void movieOn() {
        System.out.println("Movie stopped due to an error.");
    }

    @Override
    public void restartMovie() {
        System.out.println("Movie cannot Restat due to an error.");
    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {
        System.out.println("cannot resume due to an error.");
    }

    @Override
    public void playMovie() {
        System.out.println("cannot play due to an error.");
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
