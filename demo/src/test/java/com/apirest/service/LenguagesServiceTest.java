package com.apirest.service;

import com.apirest.dao.LenguagesDAOImpl;
import com.apirest.entity.Lenguages;
import org.junit.*;
import org.mockito.Mockito;

import javax.persistence.EntityManager;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

    class LenguagesServiceTest {
        @Test
    public void findById(){
        LenguagesService lenguagesService = Mockito.mock(LenguagesService.class);
        Mockito.when(lenguagesService.findAll()).thenReturn(
                Arrays.asList( new Lenguages(1,"Español"),
                            new Lenguages(1,"Español")
            )
        );
        LenguagesDAOImpl lenguagesDAOImpl = new LenguagesDAOImpl((EntityManager) lenguagesService);
        Lenguages result = lenguagesDAOImpl.findById(1);
            assertSame(new Lenguages(1, "Español"), result);
    }
}