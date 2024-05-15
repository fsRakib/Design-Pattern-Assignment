public class AllAccess implements Access {
    @Override
    public void check(String validity) {
        System.out.println(validity + " is valid");
    }
}
