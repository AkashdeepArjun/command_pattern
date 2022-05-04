package home;

public class WindowSystemReciever implements FileSystemReciever {


    @Override
    public void closeFile() {
        
        MyUtils.log("WINDOWS SYSTEM REQUEST","file closing...");
        
    }
    @Override
    public void openFile() {
        
        MyUtils.log("WINDOWS SYSTEM REQUEST","file opening...");

        
    }
    @Override
    public void writeFile() {
      
        MyUtils.log("WINDOWS SYSTEM REQUEST","file writing...");

      
    
}}
