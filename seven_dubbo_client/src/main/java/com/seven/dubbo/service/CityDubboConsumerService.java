package com.seven.dubbo.service;

import com.seven.dubbo.dto.City;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Reference;

@Component
public class CityDubboConsumerService {

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        String cityName="温岭";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}