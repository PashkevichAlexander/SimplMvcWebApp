package main.models;




//import javax.validation.constraints.Email;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;

import javax.validation.constraints.Min;

public class Person {
    private int id;

    @Min(value = 0, message = "Age should be greated than 0")
    private int age;

//    @NotEmpty(message = "Should not be empty")
  //  @Size(min = 2, max = 30 ,message = "Age should be between 2 and 30 characters")
    private String name;

    //@NotEmpty(message = "Email should not be empty")
    //@Email(message = "Email should be valid")
    private String email;

    public Person() {
    }

    public Person(int id, int age, String name, String email) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
