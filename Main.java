import io.PersonInputStream;
import io.PersonOutputStream;
import io.TeamInputStream;
import io.TeamOutputStream;
import person.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // PersonInputStream & PersonOutputStream Test
        Person paula = new Person("Bernd", "Brot", 38);

        PersonOutputStream paulaOut = new PersonOutputStream();
        paulaOut.write(paula);

        PersonInputStream paulaIn = new PersonInputStream();

        Person b = paulaIn.read("Bernd");
        System.out.println(b.toString());

        System.out.println("-----------------------");

        // TeamInputStream & TeamOutpuStream Test
        Person superMan = new Person("Clark", "Kent", 30);
        Person batMan = new Person("Bruce", "Wayne", 35);
        Person superWoman = new Person("Diana", "Prince", 1000);
        Person aquaMan = new Person("Arthur", "Curry", 25);

        // Generate Team
        List<Person> dcSuperHeroes = new ArrayList<>();
        dcSuperHeroes.add(superMan);
        dcSuperHeroes.add(batMan);
        dcSuperHeroes.add(superWoman);
        dcSuperHeroes.add(aquaMan);

        TeamOutputStream dcHeroesOutput = new TeamOutputStream("dc");
        dcHeroesOutput.write(dcSuperHeroes);

        TeamInputStream dcHeroesInput = new TeamInputStream();
        List<Person> dcTest = dcHeroesInput.read("dc");

        for(int i = 0; i < dcTest.size(); i++){
            System.out.println(dcTest.get(i).toString());
        }
    }
}