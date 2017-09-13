import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class ChildTest {

    @Test
    public void shouldVerifyEquals() throws Exception {
        EqualsVerifier.forClass(Child.class)
                //.withRedefinedSuperclass()
                //.suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS)
                .verify();
    }

}