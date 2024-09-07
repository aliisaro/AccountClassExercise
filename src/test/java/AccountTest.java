import com.example.accountclassexercise.Account;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AccountTest {
    private static Account sharedTestAccount; // Shared account instance

    @BeforeAll
    public static void setUpAll() {
        sharedTestAccount = new Account();
        System.out.println("Shared account created.\n");
    }

    @AfterAll
    public static void tearDownAll() {
        sharedTestAccount = null;
        System.out.println("Shared account terminated.\n");
    }

    @BeforeEach
    public void setUp() {
        sharedTestAccount.deposit(-sharedTestAccount.getBalance()); // Withdraw the current balance to reset the shared account
        System.out.println("Account reset to zero.");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test completed.\n");
    }
    @Test
    public void testDeposit() {
        System.out.println("Testing deposit.");
        sharedTestAccount.deposit(100.0);
        assertEquals(100.0, sharedTestAccount.getBalance());
    }

    @Test
    public void testWithdraw() {
        System.out.println("Testing withdraw.");
        sharedTestAccount.deposit(100.0);
        sharedTestAccount.withdraw(50.0);
        assertEquals(50.0, sharedTestAccount.getBalance());
    }

    @Test
    public void testNegativeWithdraw() {
        // testing withdrawing money from an empty account
        System.out.println("Testing negative withdraw.");
        sharedTestAccount.withdraw(100.0);
        assertEquals(0.0, sharedTestAccount.getBalance());
    }
}
