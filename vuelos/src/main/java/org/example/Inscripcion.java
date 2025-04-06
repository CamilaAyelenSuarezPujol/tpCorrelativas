package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribir;

    // constructor para inicializar lista
    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasAInscribir = new ArrayList<>();
    }

    public boolean aprobada() {
        return materiasAInscribir.stream().allMatch(materia -> materia.cumpleCorrelativas(alumno));
    }

}
