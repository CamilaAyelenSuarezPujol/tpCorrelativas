package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Materia {
    private String nombre;
    private List<Materia> correlativas; //materias correlativas

    // inicializo la lista con constructor
    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public boolean cumpleCorrelativas(Alumno alumno) {
        return correlativas.stream().allMatch(alumno::aproboMateria);
    }

}
