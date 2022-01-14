package com.apirest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.dao.LenguagesDAO;
import com.apirest.entity.Lenguages;
@Service
public class LenguagesServiceImpl implements LenguagesService{
	@Autowired
    private LenguagesDAO lenguagesDAO;
	
	@Override
	    public List<Lenguages> findAll() {
	        List<Lenguages> listLenguages= lenguagesDAO.findAll();
	        return listLenguages;
	    }
	 @Override
	    public Lenguages findById(int id) {
		 Lenguages llenguages = lenguagesDAO.findById(id);
	        return llenguages;
	    }

	    @Override
	    public void save(Lenguages lenguages) {
	    	lenguagesDAO.save(lenguages);

	    }

	    @Override
	    public void deleteById(int id) {
	    	lenguagesDAO.deleteById(id);
	    }
}
