package com.sergei.rest.services;

public interface CrudService<T> {
    T create(T t);

    T update(Long id, T t);

    T read(Long id);

    void delete(Long id);
}
