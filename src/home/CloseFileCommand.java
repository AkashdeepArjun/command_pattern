package home;

public class CloseFileCommand implements Command{
   private FileSystemReciever system_type;

   public CloseFileCommand(FileSystemReciever sys_type){
       this.system_type=sys_type;
   }
   
    @Override
    public void execute() {
       
        this.system_type.closeFile();
        
    }
}
