package home;

public class LinuxSystemReciever implements FileSystemReciever{

    @Override
    public void closeFile() {
        
        MyUtils.log("LINUX SYSTEM REQUEST","file closing...");
        
    }
    @Override
    public void openFile() {
        
        MyUtils.log("LINUX SYSTEM REQUEST","file opening...");

        
    }
    @Override
    public void writeFile() {
      
        MyUtils.log("LINUX SYSTEM REQUEST","file writing...");

        
    }
}