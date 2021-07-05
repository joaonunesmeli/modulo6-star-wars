package bootcamp.java.mod6.starwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class Mod6StarWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Mod6StarWarsApplication.class, args);
    }

    @GetMapping("/{term}")
    public List<StarWarsCharacter> get(@PathVariable String term) {
        return StarWarsCharacters.getMatching(term);
    }
}
