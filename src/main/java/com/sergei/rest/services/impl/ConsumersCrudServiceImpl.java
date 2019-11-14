package com.sergei.rest.services.impl;

import com.sergei.rest.dto.ConsumersDto;
import com.sergei.rest.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public class ConsumersCrudServiceImpl implements CrudService<ConsumersDto> {



    @Override
    public ConsumersDto create(ConsumersDto consumersDto) {
        return null;
    }

    @Override
    public ConsumersDto update(Long id, ConsumersDto consumersDto) {
        return null;
    }

    @Override
    public ConsumersDto read(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
