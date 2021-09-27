package io;

import person.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class TeamOutputStream {
    private File file;

    public TeamOutputStream(String name){
        this.file = new File(name);
    }

    public TeamOutputStream(File file){
        this.file = file;
    }

    public void write(List<Person> team){
        try {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < team.size(); i++){
                sb.append(team.get(i).toString());
                sb.append("\n");
            }

            Files.write(this.file.toPath(), sb.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("Could not write file!");
            System.exit(1);
        }
    }
}


