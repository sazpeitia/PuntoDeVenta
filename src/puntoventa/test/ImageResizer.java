package puntoventa.test;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import puntodeventa.sql.PuntoventaCommonObject;
import puntodeventa.sql.PuntoventaImagen;
import puntodeventa.sql.PuntoventaImagen_;

/**
 * This program demonstrates how to resize an image.
 *
 * @author www.codejava.net
 *
 */
public class ImageResizer {
    
    public static List<PuntoventaImagen> getListOfImagesFromCommonObject(EntityManager em,  PuntoventaCommonObject commonObject) {

        List<PuntoventaImagen> listaImagenes = new ArrayList<>();

        if (commonObject != null) {
            //listaImagenes = commonObject.getPuntoventaImagenList();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<PuntoventaImagen> cq = cb.createQuery(PuntoventaImagen.class);
            Root<PuntoventaImagen> imagenesObjecto = cq.from(PuntoventaImagen.class);

            cq.where(cb.equal(imagenesObjecto.get(PuntoventaImagen_.idCommonObject), commonObject));

            cq.select(imagenesObjecto);

            TypedQuery<PuntoventaImagen> q = em.createQuery(cq);

            listaImagenes = q.getResultList();

            System.out.println("Se obtuvieron las imagenes con éxito");
        }

        return listaImagenes;
    }

    public static boolean createLocalDirectory(String path) {

        boolean success;

        File newFolder = new File(path);

        success = newFolder.mkdir();

        return success;
    }

    public static Properties readFilePropeties(String path) {

        Properties prop = new Properties();
        InputStream inputStream = null;
        try {

            inputStream = new FileInputStream(path);
            prop.load(inputStream);

        } catch (FileNotFoundException ex) {

            Logger.getLogger(ImageResizer.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(ImageResizer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                inputStream.close();

            } catch (IOException ex) {

                Logger.getLogger(ImageResizer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return prop;
    }

    public static boolean retriveFileFromServer(String localPath, String server, String user, String password, String serverPath) {

        try {
            boolean success;

            FTPClient ftpClient = new FTPClient();

            ftpClient.connect(server);
            ftpClient.login(user, password);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            // APPROACH #1: using retrieveFile(String, OutputStream)
            File downloadFile1 = new File(localPath);
            OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1));
            success = ftpClient.retrieveFile(serverPath, outputStream1);
            outputStream1.close();

            if (success) {

                System.out.println("File " + serverPath + " was download sucess");
            }

            return success;

        } catch (IOException ex) {
            Logger.getLogger(ImageResizer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean deleteFileFromServer(String server, String user, String password, String serverPath) {

        try {

            boolean success;

            FTPClient ftpClient = new FTPClient();

            ftpClient.connect(server);
            ftpClient.login(user, password);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            success = ftpClient.deleteFile(serverPath);

            return success;
        } catch (Exception exception) {

            System.out.println("Ocurrió un error al eliminar el archivo del server: " + exception.getMessage());
            return false;
        }
    }

    public static boolean deleteFileLocal(String path) {

        try {

            boolean success;

            File file = new File(path);

            success = file.delete();

            return success;
        } catch (Exception exception) {

            System.out.println("Ocurrió un error al eliminar el archivo del server: " + exception.getMessage());
            return false;
        }
    }

    public static void publishImageOnLocal(BufferedImage imageToPublish, String path) throws IOException {

        String formatName = path.substring(path
                .lastIndexOf(".") + 1);
        ImageIO.write(imageToPublish, formatName, new File(path));
    }

    public static void publishImageOnServer(String localPath, String server, String user, String password, String serverPath) {

        FTPClient ftpClient = new FTPClient();

        try {

            ftpClient.connect(server);

            ftpClient.login(user, password);
            ftpClient.enterLocalPassiveMode();

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            // APPROACH #1: uploads first file using an InputStream
            File firstLocalFile = new File(localPath);

            InputStream inputStream = new FileInputStream(firstLocalFile);

            System.out.println("Start uploading file ...");
            boolean done = ftpClient.storeFile(serverPath, inputStream);
            inputStream.close();
            if (done) {
                System.out.println("The  file was uploaded successfully.");
            }
            inputStream.close();

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

    public static int calculateRelativeWidthToHeight(int originalHeight, int originalWidth, int wantedHeight) {

        int relativeWidth = 0;

        double percent = (double) wantedHeight / (double) originalHeight;
        relativeWidth = (int) (percent * originalWidth);

        return relativeWidth;
    }

    public static BufferedImage loadImageToBuffer(String path) throws IOException {

        File inputFile = new File(path);
        BufferedImage bufferedImage = ImageIO.read(inputFile);

        return bufferedImage;
    }

    public static void loadImageOnLabel(BufferedImage inputImage, JLabel jLabelImage) {

        ImageIcon icon = new ImageIcon(inputImage);
        jLabelImage.setIcon(icon);
    }

    public static void publishImageLength(BufferedImage imputImage, JLabel label) {

        try {
            ImageResizer.publishImageOnLocal(imputImage, "tmp_img_01.jpg");
            String format = String.format("S: %d kb H: %d px W: %d px",
                    (int) ImageResizer.getFileLength("tmp_img_01.jpg") / 1024,
                    imputImage.getHeight(),
                    imputImage.getWidth());

            label.setText(format);
            ImageResizer.delteFile("tmp_img_01.jpg");
        } catch (IOException ex) {
            Logger.getLogger(FtpJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static double getFileLength(String path) {

        File inputFile = new File(path);

        double length = inputFile.length();

        return length;
    }

    public static boolean delteFile(String path) {

        File inputFile = new File(path);
        return inputFile.delete();
    }

    public static boolean fileExists(String path) {

        try {
            
            File file = new File(path);
            boolean exists = file.exists();
            
            return exists;
            
        } catch (Exception exception) {

            System.out.println(exception.getMessage());
            
            return false;
        }

    }

    public static BufferedImage loadIconToBuffer(Icon icon) {

        BufferedImage bufferedImage = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);

        Graphics g = bufferedImage.createGraphics();

        // paint the Icon to the BufferedImage.
        icon.paintIcon(null, g, 0, 0);
        g.dispose();

        return bufferedImage;
    }

    public static BufferedImage rotateImage(BufferedImage inputImage) throws IOException {

        int width = inputImage.getWidth();
        int height = inputImage.getHeight();

        BufferedImage outputImage = new BufferedImage(height,
                width, inputImage.getType());

        Graphics2D graphics2D = outputImage.createGraphics();
        graphics2D.translate((height - width) / 2, (height - width) / 2);
        graphics2D.rotate(Math.PI / 2, height / 2, width / 2);
        graphics2D.drawRenderedImage(inputImage, null);

        return outputImage;
    }

    /**
     * Resizes an image to a absolute width and height (the image may not be
     * proportional)
     *
     * @param inputImage buffered image to transform
     * @param scaledWidth absolute width in pixels
     * @param scaledHeight absolute height in pixels
     * @return the result of resized image
     * @throws IOException
     */
    public static BufferedImage resize(BufferedImage inputImage, int scaledWidth, int scaledHeight)
            throws IOException {

        // creates output image
        BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());

        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        return outputImage;
    }

    /**
     * Resizes an image by a percentage of original size (proportional).
     *
     * @param inputImage
     * @param percent a double number specifies percentage of the output image
     * over the input image.
     * @return the result of resized image
     * @throws IOException
     */
    public static BufferedImage resize(BufferedImage inputImage, double percent) throws IOException {

        int scaledWidth = (int) (inputImage.getWidth() * percent);
        int scaledHeight = (int) (inputImage.getHeight() * percent);
        return resize(inputImage, scaledWidth, scaledHeight);
    }

    /**
     * Test resizing images
     */
    public static void main(String[] args) {
        String inputImagePath = "D:\\020.SAMY\\01.IMAGENES\\RESPALDO_XIAOMI_20190827\\IMG_20190827_132242.jpg";
        String outputImagePath1 = "test_250px.jpg";
        String outputImagePath2 = "test_50pc.jpg";
        String outputImagePath3 = "test_250px_rotate.jpg";

        try {
            // resize to a fixed width (not proportional)

            int scaledHeight = 250;

            BufferedImage sourceImage = loadImageToBuffer(inputImagePath);
            BufferedImage targetImage = null;

            int scaledWidth = ImageResizer.calculateRelativeWidthToHeight(sourceImage.getHeight(), sourceImage.getWidth(), scaledHeight);

            targetImage = ImageResizer.resize(sourceImage, scaledWidth, scaledHeight);

            publishImageOnLocal(targetImage, outputImagePath1);

            targetImage = ImageResizer.rotateImage(targetImage);

            publishImageOnLocal(targetImage, outputImagePath3);

            // resize smaller by 50%
            double percent = 0.5;
            targetImage = ImageResizer.resize(sourceImage, percent);

            publishImageOnLocal(targetImage, outputImagePath2);

        } catch (IOException ex) {
            System.out.println("Error resizing the image.");
            ex.printStackTrace();
        }
    }

}
