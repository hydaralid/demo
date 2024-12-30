import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileInputStream;
import java.util.List;


public class FileHandling {
    public static void main(String[] args) throws IOException {
        // CREATING A FILE USING createNewFile() METHOD
        System.out.println();
        System.out.println("createNewFile() METHOD: ");
    String fileName = "Example.txt";
    File file = new File(fileName);

    try{
    if(file.createNewFile()){
        System.out.println("File Created Successfully");
    }
    else{
        System.out.println("File already Exists! or Failed to Create");
    }

        // WRITING A FILE USING FileWriter() METHOD
    FileWriter writer = new FileWriter(fileName);
    writer.write("HISTORY OF JAVA: \n");
    writer.write("Java, conceived by James Gosling and his team at Sun Microsystems in 1991, was initially developed as part of the Green Project, aiming to \n create a language for programming household appliances.");

    System.out.println("Content written to the file Successfully");
        writer.close();
    }
    catch(IOException e){
        System.out.println(e);
    }
        System.out.println();




        // CREATING A FILE USING FileOutputStream() CONSTRUCTOR
        System.out.println("FileOutputStream() CONSTRUCTOR: ");
        String fileName1 = "Example2.txt";
        String content = "Java has several key points that make it a robust and versatile programming language";
        try(FileOutputStream file1 = new FileOutputStream(fileName1))
        {
            System.out.println("File Created Successfully");
            // WRITING A FILE USING FileOutputStream() CONSTRUCTOR
            byte[] bytes = content.getBytes();
            file1.write(bytes);
            System.out.println("Content has been written to the file!");
            file1.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println();




        // CREATING A FILE USING Files.write() METHOD
        System.out.println("Files.write() METHOD: ");
        String fileName2 = "Example3.txt";
        String content2 = "Java stands out as a highly versatile and robust programming language due to several key features.";
        try
        {
            Files.write(Paths.get(fileName2),content2.getBytes());
            System.out.println("File Created Successfully");
            System.out.println("Content has been written to the file Successfully");
        }
        catch(IOException e){
            System.out.println(e);
        }


        // Reading a File using FileReader class
        System.out.println();
        System.out.println("---------READING A FILE using FileReader class-----------");
        String fileName3 = "Example2.txt";
        try(FileReader reader = new FileReader(fileName3)){
            int character;
            while((character = reader.read())!=-1){
                System.out.print((char)character);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println();

        // Reading a File using FileInputStream constructor
        System.out.println();
        System.out.println("---------READING A FILE using FileInputStream constructor-----------");
        String fileName4 = "Example3.txt";
        try(FileInputStream fis = new FileInputStream(fileName4)){
            int byteValue;
            while((byteValue = fis.read())!=-1){
                System.out.print((char)byteValue);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println();

        // Reading a File using Files.readAllLines() method
        System.out.println();
        System.out.println("---------READING A FILE using Files.readAllLines() method-----------");
        String fileName5 = "Example.txt";
        try{
        List<String> lines = Files.readAllLines(Paths.get(fileName5));
            for(String line : lines){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }

        // DELETING A FILE
        System.out.println();
        System.out.println("---------DELETING A FILE using delete() method-----------");
        File file1 = new File("Example10.txt");
        if(file1.exists()){
            if(file.delete()){
                System.out.println("File deleted successfully");
            }
            else{
                System.out.println("Failed to delete a file");
            }
        }
        else{
            System.out.println("File does not exists!");
        }




    }
}
