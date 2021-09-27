package io;

import person.Person;

import java.io.*;
import java.nio.file.Files;

public class PersonInputStream {

    private File file;

    public PersonInputStream(){}

    public Person read(String name){
        this.file = new File(name);

        try {
            byte[] bytes = Files.readAllBytes( this.file.toPath());
            String[] csv = new String(bytes).split(";");
            return new Person(csv[0],csv[1],Integer.parseInt(csv[2]));
        } catch (IOException e) {
            System.out.println("Could not read person!");
            System.exit(1);
        }
        return null;
    }
}
