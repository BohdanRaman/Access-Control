package task6;

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
