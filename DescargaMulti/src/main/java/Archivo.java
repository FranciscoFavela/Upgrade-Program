import me.tongfei.*;
import me.tongfei.progressbar.ProgressBar;
import me.tongfei.progressbar.ProgressBarBuilder;
import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.File.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.lang.Object;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Archivo implements Runnable {
    private final String Enlace;
    private final String Ruta;
    JProgressBar progressBar;
    public  Archivo(String Enlace, String Ruta ){
    this.Enlace=Enlace;
    this.Ruta=Ruta;

    }
    ExecutorService executor = Executors.newFixedThreadPool(8);

    @Override
    public void run() {
        try (BufferedInputStream inputStream = new BufferedInputStream(new URL(Enlace).openStream());
             FileOutputStream fileOS = new FileOutputStream(Ruta);

             ) {
            int totalBytesRead=0;
            double percentCompleted = 1;
            URL url = new URL(Enlace);
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            int file_size = urlConnection.getContentLength();
            ProgressBar pb = new ProgressBar(Ruta,file_size);

            /*
            File file = new File(Ruta);
            long fileSize = FileUtils.sizeOf(file);
            System.out.println(fileSize); // bytes
            */
            byte data[] = new byte[1024];

            int byteContent;
            while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {

                fileOS.write(data, 0, byteContent);
                File file = new File(Ruta);
                double fileSize = FileUtils.sizeOf(file);

                percentCompleted = (fileSize * 100 / file_size);

               // System.out.println("Descargando "+ fileSize +" Compleatado "+ percentCompleted +"% "+ Ruta +" ......." );
                pb.stepTo((long) fileSize);
            }
            System.out.println("Descarga de "+ Ruta +"TERMINADA");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
