package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class testAproboMateria {

    @Test
    @DisplayName("El alumno aprobo la materia")
    public void aproboMateria() {
        // creo alumno
        Alumno alumno = new Alumno("Natalia");

        // creo materia
        Materia algoritmos = new Materia("Algoritmos");

        // le agrego la materia al alumno
        alumno.getMateriasAprobadas().add(algoritmos);

        // verifico
        Assertions.assertTrue(alumno.aproboMateria(algoritmos));
    }

    @Test
    @DisplayName("El alumno no aprobo la materia")
    public void noAproboMateria() {
        Alumno alumno = new Alumno("Natalia");

        Materia algoritmos = new Materia("Algoritmos");

        // verifico
        Assertions.assertFalse(alumno.aproboMateria(algoritmos));
    }
}