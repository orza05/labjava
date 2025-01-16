package ex1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MainApp {
    public static Map<Integer,Carte>citire(){
        try {
            File file=new File("src/main/resources/carti.json");
            ObjectMapper mapper=new ObjectMapper();
            Map<Integer,Carte> carti = mapper
                    .readValue(file, new TypeReference<Map<Integer,Carte>>(){});
            return carti;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void scriere(Map<Integer,Carte> carti) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/carti.json");
            mapper.writeValue(file,carti);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)  {
        //FileInputStream fileInputStream=new FileInputStream("src/main/resources/carti.json");
        //ObjectMapper mapper=new ObjectMapper();
        Map<Integer,Carte> carti=citire();
        System.out.println(carti);
        System.out.println("----------------");

        carti.putIfAbsent(7, new Carte("O scrisoare pierduta","Ion Luca Caragiale",1884));
        System.out.println(carti);
        System.out.println("----------------");

        var entryset=carti.entrySet();
        var it=entryset.iterator();
        while(it.hasNext())
        {

            var m =it.next();
            Integer key=m.getKey();
            Carte value=m.getValue();

            if (key==4)
                it.remove();
        }
        System.out.println(carti);
        System.out.println("----------------");

        scriere(carti);

        Set<Carte> c=carti.values().stream()
                .filter(carte->carte.autorul().equalsIgnoreCase("Yuval Noah Harari"))
                .collect(Collectors.toSet());
        c.forEach(System.out::println);
        System.out.println("----------------");

        c.stream().sorted(Comparator.comparing(Carte::titlul)).forEach(System.out::println);
        Optional<Set<Carte>> optional=Optional.ofNullable(c);
        System.out.println("----------------");


        if(optional.isPresent()){
            System.out.println(c.stream().sorted(Comparator.nullsFirst(Comparator.comparing(Carte::anul))).findFirst());

        }
    }

    }

