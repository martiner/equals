import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class ParentTest {

    @Test
    public void shouldVerifyEquals() throws Exception {
        EqualsVerifier.forClass(Parent.class)
                .suppress(
                        Warning.STRICT_INHERITANCE, // allow subclasses with added state
                        Warning.NONFINAL_FIELDS // this is java bean
                )
                .verify();
    }

}