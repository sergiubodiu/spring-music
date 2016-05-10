package org.cloudfoundry.samples.music.config.data;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

//@Configuration
//@Profile("redis-local")
public class RedisLocalConfig {

//    @Bean
    public RedisConnectionFactory redisConnection() {
        return new JedisConnectionFactory();
    }

}
