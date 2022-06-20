package org.generation.PandorasBox.component;

import java.io.*;
import java.nio.file.*;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {


    //this saveFile method will be called by the Controller under @PostMapping
    //ere are 3 parameters that the method requires
    //1.directory path through relative path of the root folder (where you wanna save it in)
    //2. file name of image (777x_new.jpg)
    //3. image object itself
    public static void saveFile(String uploadDir1, String fileName,
                                MultipartFile multipartFile) throws IOException

    {

        //productImages/ is the directory that we set up
        //Paths.get - convert a string to the directory path itself

        Path uploadPath1 = Paths.get(uploadDir1);

        //getInputStream method is from the multipart class package
        try (InputStream inputStream = multipartFile.getInputStream()) {

            Path filePath1 = uploadPath1.resolve(fileName);
            Files.copy(inputStream, filePath1, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }
    }
}
