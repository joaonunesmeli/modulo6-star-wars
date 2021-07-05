package bootcamp.java.mod6.starwars;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StarWarsCharacters {
    private static File file = new File("starwars.json");

    @Autowired
    private static ObjectMapper mapper = new ObjectMapper();

    private static List<StarWarsCharacter> getAll() {
        List<StarWarsCharacter> res;
        try {
            FileInputStream is = new FileInputStream(file);
            TypeReference<List<StarWarsCharacter>> tr = new TypeReference<List<StarWarsCharacter>>() {};
            res = mapper.readValue(is, tr);
            is.close();
        } catch (IOException e) {
            res = new ArrayList<>();
            e.printStackTrace();
        }
        return res;
    }

    public static List<StarWarsCharacter> getMatching(String term) {
        return getAll()
                .stream()
                .filter(c -> c.getName().toLowerCase(Locale.ROOT).contains(term.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }
}
