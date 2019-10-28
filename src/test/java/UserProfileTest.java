import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserProfileTest {

        private UserProfile testUser;

        @Test
        public void testGetUserPassword(){
            String expected = "Madskilz";
            String actual = "";
            this.testUser = new UserProfile("Madskilz");

            actual = this.testUser.getUserPassword();

            Assert.assertEquals(expected,actual);
        }

        @Test
        public void testSetUserPassword(){
            String expected = "Madskilz";
            String actual = "";
            this.testUser = new UserProfile();

            this.testUser.setUserPassword(expected);
            actual = this.testUser.getUserPassword();

            Assert.assertEquals(expected,actual);
        }
}
