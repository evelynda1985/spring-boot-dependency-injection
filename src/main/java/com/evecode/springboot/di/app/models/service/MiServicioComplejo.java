package com.evecode.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MiServicioComplejo implements IServicio{

    public String operacion(){
        return "Ejecutando algun proceso importante complicado...";
    }

}
