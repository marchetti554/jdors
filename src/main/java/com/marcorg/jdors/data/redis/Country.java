/*
 * Created by Marco Marchetti
 *
 * Created:	$ 15/12/2019
 * Updated:	$ 15/12/2019
 */
package com.marcorg.jdors.data.redis;

import lombok.Builder;
import lombok.Data;

/**
 * Represents a Country.
 *
 * @author Marco Marchetti.
 */
@Data
@Builder
public class Country {

    private String name;
    private int popInMillions;
    private int continentId;
}
