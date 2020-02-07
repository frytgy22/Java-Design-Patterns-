package org.mystat.Lebedeva;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//as tree or list with lists
//ot directory with files
public class Composite {
    public static void main(String[] args) {

    }
}
class  Folder {
    String name;
    Date createDate;
    List<Folder>folders=new ArrayList<>();
List<File>files=new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }
    void addFolder(Folder folder){
        folders.add(folder);
    }
    void removeFolder(Folder folder){
        folders.remove(folder);
    }
    List<Folder> getFolders(){
        return folders;
    }void addFile(File folder){
        files.add(folder);
    }
    void removeFile(File folder){
        files.remove(folder);
    }
    List<File> getFile(){
        return files;
    }
}
class File{
    String fileName;
}