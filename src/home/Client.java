package home;

public class Client {

    public static void main(String[] args){

    
        FileSystemReciever system= OsDetector.detectOs();

        //open file command
        OpenFileCommand open_file_commamd=new OpenFileCommand(system);

        CommandInvoker open_file_comand_invoker=new CommandInvoker(open_file_commamd);

        open_file_comand_invoker.execute();

            //write file command
        WriteFileCommand write_file_commad=new WriteFileCommand(system);

        CommandInvoker write_file_cCommandInvoker =new CommandInvoker(write_file_commad);

        write_file_cCommandInvoker.execute();


        CloseFileCommand closeFileCommand = new CloseFileCommand(system);
        CommandInvoker closeCommandInvoker = new CommandInvoker(closeFileCommand);

        closeCommandInvoker.execute();



    }
    
    
}
