package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class testAprobada {

    @Test
    @DisplayName("Se aprueba la inscripcion")
    public void apruebaInscripcion() {
        Materia economia = new Materia("Economia");
        Materia analisis1 = new Materia("Analisis1");

        // Economia requiere de Analisis 1
        economia.getCorrelativas().add(analisis1);

        Materia disenio = new Materia("Disenio");
        Materia paradigmas = new Materia("Paradigmas");

        // Diseño requiere de Paradigmas
        disenio.getCorrelativas().add(paradigmas);

        // Creo alumno y aprobo ambas correlativas
        Alumno alumno = new Alumno("Natalia");
        alumno.getMateriasAprobadas().add(analisis1);
        alumno.getMateriasAprobadas().add(paradigmas);

        // Creo la Inscripcion para Diseño y Economia
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.getMateriasAInscribir().add(economia);
        inscripcion.getMateriasAInscribir().add(disenio);

        // Verifico
        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("No se aprueba la inscripcion")
    public void noApruebaInscripcion() {
        Materia economia = new Materia("Economia");
        Materia analisis1 = new Materia("Analisis1");

        // Economia requiere de Analisis 1
        economia.getCorrelativas().add(analisis1);

        Materia disenio = new Materia("Disenio");
        Materia paradigmas = new Materia("Paradigmas");

        // Diseño requiere de Paradigmas
        disenio.getCorrelativas().add(paradigmas);

        // Creo alumno y aprobo solo la correlativa de Eco
        Alumno alumno = new Alumno("Natalia");
        alumno.getMateriasAprobadas().add(analisis1);

        // Creo la Inscripcion para Diseño y Economia
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.getMateriasAInscribir().add(economia);
        inscripcion.getMateriasAInscribir().add(disenio);

        // Verifico
        Assertions.assertFalse(inscripcion.aprobada());
    }

}