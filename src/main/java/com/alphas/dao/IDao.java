package com.alphas.dao;


import java.util.List;

public interface IDao<t>{

    void save(t a);

    void update(t a);

    t getById(long id);

    List<t> getAll();

    void delete(long id);
}
