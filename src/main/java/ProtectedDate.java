public class ProtectedDate {
    protected String name;
    protected int age;

    protected void protectedAge() {
    }

    protected void protectedName() {
    }

    private static class ProtectedDateClass {
        public static void main(String[] args) {
            ProtectedDate protectedDate = new ProtectedDate();
            protectedDate.protectedAge();
            protectedDate.protectedName();
            System.out.println(protectedDate.age);
            System.out.println(protectedDate.name);
        }

    }
}
