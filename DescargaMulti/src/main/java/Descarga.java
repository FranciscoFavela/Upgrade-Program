
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

    public class Descarga {

        public static void main(String[] args) {
            Thread a1 = new Thread(new Archivo("https://iweb.dl.sourceforge.net/project/reactos/ReactOS/0.4.14/ReactOS-0.4.14-iso.zip","/Users/a839607/ReactOS-0.4.14-iso.zip"));
            Thread a2 = new Thread(new Archivo("https://downloads-global.3cx.com/downloads/debian10iso/debian-amd64-netinst-3cx.iso","/Users/a839607/debian-amd64-netinst-3cx.iso"));

            a1.start();
            a2.start();
            a1.setPriority(Thread.MAX_PRIORITY);
            a2.setPriority(Thread.NORM_PRIORITY);
        }
    }

