package io;

import person.Person;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class PersonOutputStream {
    private File file;

    public PersonOutputStream(File file) {
        this.file = file;
    }

    public PersonOutputStream(String name){
        this.file = new File(name);
    }

    public PersonOutputStream(){
        this.file = null;
    }

    public void write(Person a){
        try {
            if(this.file == null){
                this.file = new File(a.getForeName());
            }
            Files.write(this.file.toPath(), a.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
           System.out.println("Could not write file!");
           System.exit(1);
        }
    }
}
