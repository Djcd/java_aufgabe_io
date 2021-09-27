package person;

public class Person {
    private String surName;
    private String foreName;
    private int age;

    public Person(String foreName, String surName, int age){
        this.foreName = foreName;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString(){
        return foreName+";"+surName+";"+age;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
