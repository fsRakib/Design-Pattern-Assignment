public class User {
    public static void main(String[] args) {
        Access access = new ProxyAccess();

        access.check("Admin");  // Should print "Admin is valid"
        access.check("User");   // Should print "User doesn't have permission"
    }
}

