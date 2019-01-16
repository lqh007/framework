package com.seven.base.service;

import com.seven.base.dto.City;
import org.springframework.stereotype.Component;

@Component
public interface CityDubboService{
     City findCityByName(String cityName);
}
