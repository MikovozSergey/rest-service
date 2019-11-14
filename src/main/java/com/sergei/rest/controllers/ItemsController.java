package com.sergei.rest.controllers;

import com.sergei.rest.dto.ItemsDto;
import com.sergei.rest.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private CrudService<ItemsDto> itemsCrudService;

    @PostMapping("/")
    public ItemsDto create(@RequestBody ItemsDto itemsDto) {
        return itemsCrudService.create(itemsDto);
    }

    @GetMapping("/{id}")
    public ItemsDto get(@PathVariable("id") Long id) {
        return itemsCrudService.read(id);
    }
}
