package com.seven.security.demo.service;

import com.seven.security.demo.dto.City;
import org.springframework.stereotype.Component;

@Component
public interface CityDubboService{
     City findCityByName(String cityName);
}
