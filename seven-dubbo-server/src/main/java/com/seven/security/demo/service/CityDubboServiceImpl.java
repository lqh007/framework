package com.seven.security.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.seven.security.demo.dto.City;

// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        return new City(1L,2L,"温岭","是我的故乡");
    }
}