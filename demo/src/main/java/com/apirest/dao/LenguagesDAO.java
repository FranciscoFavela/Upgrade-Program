package com.apirest.dao;
import  com.apirest.entity.*;
import java.util.List;
public interface LenguagesDAO {
	public List<Lenguages> findAll();

    public Lenguages findById(int id);

    public void save(Lenguages lenguages);

    public void deleteById(int id);
}
