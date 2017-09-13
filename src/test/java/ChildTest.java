import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class ChildTest {

    @Test
    public void shouldNotEqualWithParent() throws Exception {
        final Parent parent = new Parent();
        parent.setSurname("foo");

        final Child child = new Child();
        child.setSurname("foo");
        child.setName("bar");

        assertNotEquals(parent, child);
    }

    @Test
    public void shouldVerifyEquals() throws Exception {
        EqualsVerifier.forClass(Child.class)
                .withRedefinedSuperclass()
                .suppress(
                        Warning.NONFINAL_FIELDS // this is java bean
                )
                .verify();
    }

}