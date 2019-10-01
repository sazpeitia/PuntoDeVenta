package puntoventa.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.io.CopyStreamAdapter;

public class TestFtp {
    
    private static  int percent;

    public static void main(String[] args) {

        String server = "localhost";
        //int port = 22;
        String user = "puntoventa@any.com";
        String pass = "h3110WorlD";
        

        FTPClient ftpClient = new FTPClient();

        try {

            ftpClient.connect(server);

            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            // APPROACH #1: uploads first file using an InputStream
            File firstLocalFile = new File("D:\\020.SAMY\\01.IMAGENES\\RESPALDO_XIAOMI_20190827\\IMG_20190827_132242.jpg");

            String firstRemoteFile = "/puntoventa/IMG_01.jpg";
            InputStream inputStream = new FileInputStream(firstLocalFile);

            System.out.println("Start uploading first file");
            boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
            inputStream.close();
            if (done) {
                System.out.println("The first file is uploaded successfully.");
            }

            // APPROACH #2: uploads second file using an OutputStream
            File secondLocalFile = new File("D:\\020.SAMY\\01.IMAGENES\\RESPALDO_XIAOMI_20190827\\IMG_20190827_165951.jpg");
            String secondRemoteFile = "/puntoventa/IMG_02.jpg";
            final long fileSize = secondRemoteFile.length();
            inputStream = new FileInputStream(secondLocalFile);

            CopyStreamAdapter streamListener = new CopyStreamAdapter() {

                @Override
                public void bytesTransferred(long totalBytesTransferred, int bytesTransferred, long streamSize) {
                    //this method will be called everytime some bytes are transferred

                    percent = (int) (totalBytesTransferred * 100 / fileSize);
                    // update your progress bar with this percentage
                }
            };
            ftpClient.setCopyStreamListener(streamListener);
            

            System.out.println("Start uploading second file");
            OutputStream outputStream = ftpClient.storeFileStream(secondRemoteFile);
            byte[] bytesIn = new byte[4096];
            int read = 0;

            while ((read = inputStream.read(bytesIn)) != -1) {
                outputStream.write(bytesIn, 0, read);
                System.out.println(percent + "%");
            }
            inputStream.close();
            outputStream.close();

            boolean completed = ftpClient.completePendingCommand();
            if (completed) {
                System.out.println("The second file is uploaded successfully.");
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
