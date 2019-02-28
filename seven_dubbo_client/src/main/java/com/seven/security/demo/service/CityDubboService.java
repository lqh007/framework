package com.seven.security.demo.service;

import com.seven.security.demo.dto.City;

public interface CityDubboService {
     City findCityByName(String cityName);
}
