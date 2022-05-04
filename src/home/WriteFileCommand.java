package home;

public class WriteFileCommand implements Command{

    private FileSystemReciever sys_type;

    public WriteFileCommand(FileSystemReciever sys_type){
        this.sys_type=sys_type;
    }
    @Override
    public void execute() {
        
        this.sys_type.writeFile();
        
    }
    
}
