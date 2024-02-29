package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite (Directory)
class Directory implements AbstractFile {
    private String name;
    private List<AbstractFile> files = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addFile(AbstractFile file) {
        files.add(file);
    }

    public void removeFile(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        for (AbstractFile file : files) {
            file.ls();
        }
    }
}
