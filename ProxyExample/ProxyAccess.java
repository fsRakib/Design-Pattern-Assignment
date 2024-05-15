import java.util.ArrayList;
import java.util.List;

public class ProxyAccess implements Access {
    
    private Access allAccess;
    private List<String> haveAccess;

    public ProxyAccess() {
        allAccess = new AllAccess();
        haveAccess = new ArrayList<>();

        haveAccess.add("Admin");
    }

    @Override
    public void check(String validity) {
        if (haveAccess.contains(validity)) {
            allAccess.check(validity);
        } else {
            System.out.println(validity + " doesn't have permission");
        }
    }
}
