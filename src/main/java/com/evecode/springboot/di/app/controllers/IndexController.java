package com.evecode.springboot.di.app.controllers;

import com.evecode.springboot.di.app.models.service.IServicio;
import com.evecode.springboot.di.app.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //Esto es lo que habria que hacer si no trabajamos con DI
    //private MiServicio servicio = new MiServicio();

    //Cuando no tenemos interfaces se usa asi, no es recomenadable es muy acoplado
    //@Autowired
    //private MiServicio servicio;

    @Autowired
    //@Qualifier("miServicioSimple") //Para indicar exactamente el componente a injectar (over @Primary)
    private IServicio servicio;

    //DI por medio de constructor
//    @Autowired
//    public IndexController(IServicio servicio) {
//        this.servicio = servicio;
//    }

    @GetMapping({"/", "", "/index"})
    public String index(Model model){
        model.addAttribute("objecto", servicio.operacion());
        return "index";
    }

    //DI por medio de metodos
//    @Autowired
//    public void setServicio(IServicio servicio) {
//        this.servicio = servicio;
//    }
}
