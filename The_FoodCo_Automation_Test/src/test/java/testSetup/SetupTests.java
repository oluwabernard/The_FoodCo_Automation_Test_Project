package testSetup;

import Setup.Setups;
import org.testng.annotations.Test;

public class SetupTests extends Setups {

    @Test
    public void testGetPageURl() {
        String pageURL = "https://foodco.ng/user-account/customer-logout/?_wpnonce=731f85aef9";
        if (pageURL.equalsIgnoreCase("https://foodco.ng/user-account/customer-logout/?_wpnonce=731f85aef9")) {
            System.out.println("Account logged out. Page is" + pageURL);
        } else {
            System.out.println("Invalid URL. Actual webpage is" + pageURL);
        }

    }
    }
