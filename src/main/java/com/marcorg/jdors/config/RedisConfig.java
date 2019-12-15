/*
 * Created by Marco Marchetti
 *
 * Created:	$ 15/12/2019
 * Updated:	$ 15/12/2019
 */
package com.marcorg.jdors.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Holds the Redis configuration.
 *
 * @author Marco Marchetti
 */
@Configuration
public class RedisConfig {

    /**
     * Jedis connection factory bean.
     */
    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        return new JedisConnectionFactory();
    }

    /**
     * Redis template bean.
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        return template;
    }
}
