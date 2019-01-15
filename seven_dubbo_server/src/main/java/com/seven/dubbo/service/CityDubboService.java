package com.seven.dubbo.service;

import com.seven.dubbo.dto.City;

public interface CityDubboService{
     City findCityByName(String cityName);
}
