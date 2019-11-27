package CaseStudent.Controllers.Task1;

import CaseStudent.Model.House;
import CaseStudent.Model.Room;
import CaseStudent.Model.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteAndReadyFileCSV {
    //the delimiter to use for separating entries
    private static final char DEFAULT_SEPARATOR = ',';
    // the character to use for quoted elements
    private static final char DEFAULT_QUOTE = '"';
    private static final int NUMBER_OF_LINE_SKIP = 1;
    private static final String pathVilla = "src/CaseStudent/YeuCau7/Data/Villa.csv";
    private static final String pathHouse = "src/CaseStudent/YeuCau7/Data/House.csv";
    private static final String pathRoom = "src/CaseStudent/YeuCau7/Data/Room.csv";
    // header Villa.csv
    private static String[] headerRecordVIlla = new String[]{"id", "name", "area_used", "rental_costs", "maximum_number_of_people", "type_of_rent", "room_standard", "description_of_other_amenities", "number_of_floors", "pool_area"};
    private static String[] headerRecordHouse = new String[]{"id", "name", "area_used", "rental_costs", "maximum_number_of_people", "type_of_rent", "room_standard", "description_of_other_amenities", "number_of_floors"};
    private static String[] headerRecordRoom = new String[]{"id", "name", "area_used", "rental_costs", "maximum_number_of_people", "type_of_rent", "free_service_included"};

    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVIlla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getName(),
                        villa.getId(),

                        String.valueOf(villa.getArea_used()),
                        String.valueOf(villa.getRental_costs()),
                        String.valueOf(villa.getMaximum_number_of_people()),
                        villa.getType_of_rent(),
                        villa.getRoom_standard(),
                        villa.getDescription_of_other_amenities(),
                        String.valueOf(villa.getNumber_of_floors()),
                        String.valueOf(villa.getPool_area())
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeRoomToFileCSV(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(),
                        room.getName(),
                        String.valueOf(room.getArea_used()),
                        String.valueOf(room.getRental_costs()),
                        String.valueOf(room.getMaximum_number_of_people()),
                        room.getType_of_rent(),
                        room.getFree_service_included(),
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeHouseToFileCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(),
                        house.getName(),
                        String.valueOf(house.getArea_used()),
                        String.valueOf(house.getRental_costs()),
                        String.valueOf(house.getMaximum_number_of_people()),
                        house.getType_of_rent(),
                        house.getRoom_standard(),
                        house.getDescription_of_other_amenities(),
                        String.valueOf(house.getNumber_of_floors()),
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // fun get list form CSV
    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVIlla);
        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUMBER_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }
    public static ArrayList<House> getHouseFromCSV() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHouse);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        // get house
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUMBER_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }
    //get room
    public static ArrayList<Room> getRoomFromCSV() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUMBER_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }

}
