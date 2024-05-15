import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addComponent(FileSystem component) {
        children.add(component);
    }

    public void removeComponent(FileSystem component) {
        children.remove(component);
    }

    @Override
    public void displayDetails() {
        System.out.println("Directory: " + name);
        System.out.println("Contents:");
        for (FileSystem component : children) {
            component.displayDetails();
        }
    }
}
