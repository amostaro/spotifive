package com.ciandt.summit.bootcamp2022.infrastructure.configuration;

import com.ciandt.summit.bootcamp2022.domain.port.interfaces.MusicServicePort;
import com.ciandt.summit.bootcamp2022.domain.port.repository.MusicRepositoryPort;
import com.ciandt.summit.bootcamp2022.domain.service.MusicServiceImpl;
import com.hazelcast.config.MapConfig;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.Cluster;
import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
@Configuration
@RequiredArgsConstructor
@EnableCaching
public class BeanConfiguration {

    @Bean
    Config config() {
        Config config = new Config();

        MapConfig mapConfig = new MapConfig();
        mapConfig.setTimeToLiveSeconds(600);
        config.getMapConfigs().put("DataDTO", mapConfig);
        return config;
    }

    @Bean
    MusicServicePort musicServicePort(MusicRepositoryPort musicRepositoryPort) {
        return new MusicServiceImpl(musicRepositoryPort);
    }


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
