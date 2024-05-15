public class File implements FileSystem {
    private String name;
    private String size;

    public File(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("File: " + name + " (Size: " + size + ")");
    }
}

