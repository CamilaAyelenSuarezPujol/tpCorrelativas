package org.example;


import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter

public class Alumno {
    @Setter private String nombre;
    private List<Materia> materiasAprobadas;

    //cuando tengo una coleccion, hay que inicializarla
    //creo un constuctor
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    // quiero saber si aprobo la materia
    public boolean aproboMateria(Materia materia) {
        return materiasAprobadas.contains(materia);
    }

}