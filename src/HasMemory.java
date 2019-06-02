public class HasMemory implements DownloaderStates {

    DownloaderMachine machine;

    public HasMemory(DownloaderMachine machine){
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
        if(machine.availableMemory > 0){
            System.out.println("enter hasMemory state");
            machine.parallelStates.add(this);
        }
    }

    @Override
    public void downloadAborted() {
        if(machine.availableMemory <= 0){
            System.out.println("exit hasMemory state");
            machine.parallelStates.remove(this);
        }
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
