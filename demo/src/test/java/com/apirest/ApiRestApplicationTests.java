package com.apirest;

import com.apirest.dao.LenguagesDAO;
import com.apirest.entity.Lenguages;
import com.apirest.service.LenguagesService;
import com.apirest.service.LenguagesServiceImpl;
import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

@RunWith(SpringRunner.class	)
@SpringBootTest
public class ApiRestApplicationTests {
		@Autowired
		private LenguagesServiceImpl lenguagesServiceiml;
		@MockBean
		private LenguagesDAO lenguagesDAO;
	@Test
	public void Getall() {
		Mockito.when(lenguagesDAO.findAll()).thenReturn(Stream.of(new Lenguages(1,"español"	),new Lenguages(2,"English")).collect(Collectors.toList()));
		assertEquals(2,lenguagesDAO.findAll().size());
	}
	@Test
	public void GetOneByID() {
		int id=1;
		Mockito.when(lenguagesDAO.findById(id)).thenReturn(new Lenguages(1,"Español"));
		assertSame(new Lenguages(1,"Español"),lenguagesDAO.findById(id));
		}
	@Test
	public void SaveOneLenguage() {
		int id=2;
		Lenguages lenguages = new Lenguages(2,"Ingles");
		lenguagesServiceiml.save(lenguages);
		Mockito.verify(lenguagesDAO,times(1)).save(lenguages);

	}
	@Test
	public void DeleteOneLenguage() {
		int id=2;
		Lenguages lenguages = new Lenguages(2,"Ingles");
		lenguagesServiceiml.deleteById(id);
		Mockito.verify(lenguagesDAO,times(1)).deleteById(id);
	}
}
