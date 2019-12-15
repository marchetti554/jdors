package com.marcorg.jdors.controller;

import com.marcorg.jdors.data.redis.Country;
import com.marcorg.jdors.repository.CountryRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RestController("/data")
public class DataController {

    private CountryRepository countryRepository;

    @GetMapping("/test/countries")
    List<Country> retrieveAllCountries() {
        return (List<Country>) countryRepository.findAll();
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
