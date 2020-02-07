package org.mystat.Lebedeva;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
//добавить свой функциогая к готовому методу InpetStream.read
public class DecoratorLessons {
    public static void main(String[] args) throws FileNotFoundException {
        //InputStream inputStream=new BufferedInputStream(new FileInputStream(""));
        FileStream fileStream=new FileBufferedReader(new FileStreamReader());
        fileStream.read();
    }
}
interface  FileStream{
    void read();
}
class FileStreamReader implements FileStream{

    @Override
    public void read() {
        System.out.println("read file.");
    }
}
abstract class FileDecorator implements FileStream{
    FileStream fileDecorator;

    public FileDecorator(FileStream fileDecorator) {
        this.fileDecorator = fileDecorator;
    }
    public abstract void read();
}
class FileBufferedReader extends FileDecorator{
    public FileBufferedReader(FileStream fileDecorator) {
        super(fileDecorator);
    }

    @Override
    public void read() {
        fileDecorator.read();
        System.out.println("add my new functional");//add my functional
    }
}