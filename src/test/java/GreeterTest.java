import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 6/27/13
 * Time: 4:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class GreeterTest {
    @Test
    public void says_hello_to_the_world() {
        Greeter greeter = new Greeter();
        assertThat("", is(""));
    }
}
