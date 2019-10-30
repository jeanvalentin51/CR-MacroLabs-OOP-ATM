import java.util.HashMap;
import java.util.Map;

public class AccountRepository {

    private volatile Map<String, AccountRepository> accountRepository = new HashMap<>();

}
