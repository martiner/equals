public class Parent {

    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parent{");
        sb.append("surname='").append(surname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Parent)) return false;

        final Parent parent = (Parent) o;

        return surname != null ? surname.equals(parent.surname) : parent.surname == null;
    }

    @Override
    public int hashCode() {
        return surname != null ? surname.hashCode() : 0;
    }
}
