package com.clinica.dao;

import java.util.List;

public abstract class CRUD<T, E> {

    // Se requiere clase generica para el repositorio
    protected E repository;


    public CRUD(E repostory){
        this.repository = repostory;
    }

    public abstract List<T> list();

    public abstract T get(int id);

    public abstract void add(T o);

    public abstract void update(T o, int id);

    public abstract void delete(int id);

}
