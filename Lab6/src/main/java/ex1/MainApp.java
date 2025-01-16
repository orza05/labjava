package ex1;
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainApp {
    public static void scriere(List<Angajat>lista){
        try{
            ObjectMapper mapper=new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            File file=new File("src/main/resources/angajati.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Angajat> citire() {
        try {
            File file=new File("src/main/resources/angajati.json");
            ObjectMapper mapper=new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            List<Angajat> angajati = mapper
                    .readValue(file, new TypeReference<List<Angajat>>(){});
            return angajati;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
     List<Angajat>angajati=citire();
        //System.out.println(angajati);
        angajati.forEach(System.out::println);

        System.out.println("Angajati care au salariul peste 2000 RON: ");
        angajati
                .stream()
                .filter((s)->s.getSalariu()>2000)
                .forEach(System.out::println);

        List<Integer> intregi=List.of(9,10,8,9,7);
        List<Integer> nr_naturale=intregi
                .stream()
                .filter((nr)->nr>=9)
                .collect(Collectors.toList());
        System.out.println("Numere naturale extrase din lista de intregi:");
        nr_naturale.forEach(System.out::println);
    }
}
