package home;

import java.io.File;

public class OsDetector {

    public static FileSystemReciever detectOs(){

        String os_name=System.getProperty("os.name");
        MyUtils.log("DETECTED OS ", os_name);
        if(os_name.contains("Windows")){
            return new WindowSystemReciever();
        }else{
            return new LinuxSystemReciever();
        }

    }
    
}
