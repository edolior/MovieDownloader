import java.util.concurrent.TimeUnit;

public class IsDownloading implements DownloaderStates {

    DownloaderMachine machine;
    private double count;
    private String currFile;

    public IsDownloading(DownloaderMachine machine){
        this.machine = machine;
        count = 10;
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
        this.currFile = filename;
        if(machine.availableMemory > 10){
            System.out.println("enter isDownloading state");
            if(machine.status > 4) {
                while (count > 0){
                    count -= 1;
                    wait(1);
                    }
                }
            else if (machine.status <= 4 && machine.status > 7) {
                while (count > 0){
                    count -= 1.2;
                    wait(1);
                }
            }
            else{
                while (count > 0){
                    count -= 1.5;
                    wait(1);
                }
            }
            machine.availableMemory -= 10;
            machine.rank += 1;
            machine.parallelStates.add(this);
            machine.status += 1;
            count = 10;
        }

        else{
            System.out.println("no memory");
            wait(4);
            count = 10;
            machine.noMemory.downloadAborted();
        }
    }

    private void wait (int time){
        try{
            TimeUnit.SECONDS.sleep(time);
        }
        catch (Exception e){

        }
    }

    @Override
    public void downloadAborted() {
        machine.rank -= 1;
        machine.availableMemory += 10;
        machine.parallelStates.remove(this);
        System.out.println("exit isDownloadind state");
    }

    @Override
    public void downloadError() {
        downloadAborted();
    }

    @Override
    public void errorFixed() {
        fileRequest(this.currFile);
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
        this.machine.availableMemory = 100;
        System.out.println("file: " +filename + " deleted.");
    }
}
