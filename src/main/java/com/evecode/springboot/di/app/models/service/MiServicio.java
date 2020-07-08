package com.evecode.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

@Service("miServicioSimple")
public class MiServicio implements IServicio{

    public String operacion(){
        return "Ejecutando algun proceso importante simple...";
    }

}
