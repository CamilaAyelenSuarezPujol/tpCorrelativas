package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testCumpleCorrelativas {

    @Test
    @DisplayName("Aprobo correlativas")
    public void aproboCorrelativas() {
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        Materia discreta = new Materia("Discreta");

        // Paradigmas requiere Algoritmos y Discreta
        paradigmas.getCorrelativas().add(algoritmos);
        paradigmas.getCorrelativas().add(discreta);

        // Creo alumno, y aprobo ambas
        Alumno alumno = new Alumno("Natalia");
        alumno.getMateriasAprobadas().add(algoritmos);
        alumno.getMateriasAprobadas().add(discreta);

        // Verifico
        Assertions.assertTrue(paradigmas.cumpleCorrelativas(alumno));

    }

    @Test
    @DisplayName("No aprobo correlativas")
    public void noAproboCorrelativas() {
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        Materia discreta = new Materia("Discreta");

        // Paradigmas requiere Algoritmos y Discreta
        paradigmas.getCorrelativas().add(algoritmos);
        paradigmas.getCorrelativas().add(discreta);

        // Creo alumno, y aprobo solo algoritmos
        Alumno alumno = new Alumno("Natalia");
        alumno.getMateriasAprobadas().add(algoritmos);

        // Verifico
        Assertions.assertFalse(paradigmas.cumpleCorrelativas(alumno));

    }
}