package protected_date_task_6;

/**
 * Create a class with protected data. Create a second class in the same file
 * with a method that manipulates the protected data in the first class
 */

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
