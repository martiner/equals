import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class ParentTest {

    @Test
    public void shouldVerifyEquals() throws Exception {
        EqualsVerifier.forClass(Parent.class)
                .withRedefinedSubclass(ParentChild.class)
                .suppress(
                        Warning.NONFINAL_FIELDS // this is java bean
                )
                .verify();
    }

    private static class ParentChild extends Parent {
        private String field;

        public String getField() {
            return field;
        }

        public void setField(final String field) {
            this.field = field;
        }

        @Override
        public boolean canEqual(final Object o) {
            return o instanceof ParentChild;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof ParentChild)) return false;
            if (!super.equals(o)) return false;

            final ParentChild that = (ParentChild) o;
            if (!(that.canEqual(this))) return false;

            return field != null ? field.equals(that.field) : that.field == null;
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + (field != null ? field.hashCode() : 0);
            return result;
        }
    }
}