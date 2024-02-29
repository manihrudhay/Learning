package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Example Usage
public class CompositeMain {
    public static void main(String[] args) {
        // Creating files
        AbstractFile file1 = new File("file1.txt");
        AbstractFile file2 = new File("file2.txt");
        AbstractFile file3 = new File("file3.txt");

        // Creating directories
        AbstractFile dir1 = new Directory("Folder1");
        AbstractFile dir2 = new Directory("Folder2");

        // Adding files to directories
        ((Directory) dir1).addFile(file1);
        ((Directory) dir1).addFile(file2);

        ((Directory) dir2).addFile(file3);

        // Adding directories to another directory
        AbstractFile rootDir = new Directory("Root");
        ((Directory) rootDir).addFile(dir1);
        ((Directory) rootDir).addFile(dir2);

        // Listing the contents of the root directory
        rootDir.ls();
    }
}

