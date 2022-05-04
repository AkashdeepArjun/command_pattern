package home;

public class OpenFileCommand implements Command {
   private FileSystemReciever system_reciever;

   public OpenFileCommand(FileSystemReciever sys_reciever){
       this.system_reciever=sys_reciever;
   }

    @Override
    public void execute() {
        this.system_reciever.openFile();
        
    }
}
