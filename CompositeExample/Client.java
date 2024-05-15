public class Client {
    public static void main(String[] args) {
        File file1 = new File("Document.txt", "100KB");
        File file2 = new File("Image.jpg", "10MB");
        File file3 = new File("Spreadsheet.xlsx", "1000KB");

        Directory directory1 = new Directory("Documents");
        directory1.addComponent(file1);
        directory1.addComponent(file3);

        Directory directory2 = new Directory("Pictures");
        directory2.addComponent(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        rootDirectory.displayDetails();
    }
}
