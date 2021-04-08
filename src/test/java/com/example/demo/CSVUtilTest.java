package com.example.demo;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtilTest {


    @Test
    void converterData(){
        var uri =  this.getClass().getClassLoader().getResource("data.csv");
        List<Player> list = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(uri.getFile()))) {
            List<String[]> r = reader.readAll();
            //TODO: agregar el objeto item a una lista
            list.add(new Player());
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            e.printStackTrace();
        }
    }

}
