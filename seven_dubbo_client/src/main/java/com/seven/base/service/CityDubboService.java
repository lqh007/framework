package com.seven.base.service;

import com.seven.base.dto.City;

public interface CityDubboService {
     City findCityByName(String cityName);
}
