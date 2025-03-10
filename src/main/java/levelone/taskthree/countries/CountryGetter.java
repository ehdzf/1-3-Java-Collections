package levelone.taskthree.countries;

import levelone.taskthree.files.ReadFileIntoHashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CountryGetter {
    private static final ReadFileIntoHashmap reader = new ReadFileIntoHashmap("countries.txt");
    private static final HashMap<String, String> countries = reader.getCountries();
    private static final Random random = new Random();


    private CountryGetter() {
        throw new IllegalStateException("Utility class");
    }

    public static Map.Entry<String, String> getRandomCountry() {
        if (countries.isEmpty()) {
            return null;
        }
        ArrayList<Map.Entry<String, String>> countryList = new ArrayList<>(countries.entrySet());

        int randomIndex = random.nextInt(countryList.size());
        return countryList.get(randomIndex);
    }
}

