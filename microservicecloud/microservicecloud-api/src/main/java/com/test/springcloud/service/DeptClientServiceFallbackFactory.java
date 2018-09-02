package com.test.springcloud.service;

import com.test.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<IDeptClientService> {
    @Override
    public IDeptClientService create(Throwable throwable) {
        return new IDeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDname("NO_DATA");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
