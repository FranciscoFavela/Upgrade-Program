package com.apirest.service;

import java.util.List;
import com.apirest.entity.*;
public interface LenguagesService {
	public List<Lenguages> findAll();

    public Lenguages findById(int id);

    public void save(Lenguages lenguages);

    public void deleteById(int id);
}
