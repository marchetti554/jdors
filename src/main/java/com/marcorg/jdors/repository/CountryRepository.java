package com.marcorg.jdors.repository;

import com.marcorg.jdors.data.redis.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * In charge of CRUD functionality around 'Country' data.
 *
 * @author Marco Marchetti
 */
@Repository
public interface CountryRepository extends CrudRepository<Country, String> {

}
