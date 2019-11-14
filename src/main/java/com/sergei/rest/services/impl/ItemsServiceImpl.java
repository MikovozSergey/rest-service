package com.sergei.rest.services.impl;

import com.sergei.rest.dto.ItemsDto;
import com.sergei.rest.entities.Items;
import com.sergei.rest.repositories.ItemsRepository;
import com.sergei.rest.services.CrudService;
import com.sergei.rest.services.MapperService;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements CrudService<ItemsDto> {

    private final ItemsRepository itemsRepository;
    private final MapperService mapperService;

    public ItemsServiceImpl(ItemsRepository itemsRepository, MapperService mapperService) {
        this.itemsRepository = itemsRepository;
        this.mapperService = mapperService;
    }


    @Override
    public ItemsDto create(ItemsDto itemsDto) {
        Items items = new Items();
        mapperService.map(itemsDto, items);
        itemsRepository.save(items);
        mapperService.map(items, itemsDto);
        return itemsDto;
    }

    @Override
    public ItemsDto update(Long id, ItemsDto itemsDto) {
        Items items = itemsRepository.findById(id).orElse(null);
        if (items == null) {
            return null;
        }
        mapperService.map(itemsDto, items);
        itemsRepository.save(items);
        return itemsDto;
    }

    @Override
    public ItemsDto read(Long id) {
        Items items = itemsRepository.findById(id).orElse(null);
        ItemsDto itemsDto = new ItemsDto();
        mapperService.map(items, itemsDto);
        return itemsDto;
    }

    @Override
    public void delete(Long id) {
        itemsRepository.delete(itemsRepository.getOne(id));
    }
}
