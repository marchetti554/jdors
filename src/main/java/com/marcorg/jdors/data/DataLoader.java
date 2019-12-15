/*
 * Created by Marco Marchetti
 *
 * Created:	$ 15/12/2019
 * Updated:	$ 15/12/2019
 */
package com.marcorg.jdors.data;

import com.marcorg.jdors.data.redis.Country;
import com.marcorg.jdors.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * Loads the necessary data to be used through Redis.
 *
 * Data loaded:
 *  1. Countries information.
 *  2. TBC/TBD
 *
 * @author Marco Marchetti
 */
@Component
public final class DataLoader {

    private CountryRepository countryRepository;

    /**
     * Random math object in charge of generate a random number.
     */
    private Random random = new Random();

    /**
     * Lists of data.
     */
    private List<Country> countries = new ArrayList<>();

    /**
     * Loads all data in cache.
     *
     * {@link PostConstruct} used to execute this method just
     * after the bean creation.
     */
    @PostConstruct
    public void loadAllData() {
        loadCountriesData();
    }

    /**
     * Loads countries data in cache.
     */
    private void loadCountriesData() {
        String[] countriesNameArray = Locale.getISOCountries();
        for(int i = 0; i < 5; i++) {
            Country country = Country.builder()
                    .continentId(i + 1)
                    .name(countriesNameArray[random.nextInt(countriesNameArray.length)])
                    .popInMillions(45 + i)
                    .build();
            countries.add(country);
        }
        countryRepository.saveAll(countries);
    }

    /**
     *
     * @param countryRepository
     */
    @Autowired
    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
}
