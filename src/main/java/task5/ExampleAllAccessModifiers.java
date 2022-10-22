/**
 * Create a class with public, private, protected, and package-access fields and method members.
 * Create an object of this class and see what kind of compiler messages you get when you try to access all the class members.
 * Be aware that classes in the same directory are part of the “default” package.
 */
package task5;

public class ExampleAllAccessModifiers {
    int number;
    public int age;
    protected String name;
    private String surName;

    int getFirstNumber() {
        return number;
    }

    public int getMyAge() {
        return age;
    }

    private String getMyName() {
        return null;
    }

    protected String getMySurName() {
        return null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
