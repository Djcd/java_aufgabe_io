package io;

import person.Person;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TeamInputStream {
    private File file;

    public TeamInputStream(){}

    public List<Person> read(String team){
        this.file = new File(team);

        try {
            byte[] bytes = Files.readAllBytes( this.file.toPath());
            String[] persons = new String(bytes).split("\n");
            List<Person> members = new ArrayList<>();

            for(String person : persons){
                String[] csv = person.split(";");
                members.add(new Person(csv[0],csv[1],Integer.parseInt(csv[2])));
            }
            return members;
        } catch (IOException e) {
            System.out.println("Could not read person!");
            System.exit(1);
        }
        return null;
    }
}
