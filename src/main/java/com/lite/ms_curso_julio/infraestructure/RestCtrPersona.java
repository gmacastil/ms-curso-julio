package com.lite.ms_curso_julio.infraestructure;

import org.springframework.web.bind.annotation.RestController;

import com.lite.ms_curso_julio.domain.DTOCurso;
import com.lite.ms_curso_julio.domain.DTOPersona;

import lombok.val;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class RestCtrPersona {

    @Value("${data.trm}")
    private String TRM;
    
    @GetMapping("/")
    public DTOCurso getCurso() {
        // Simular la obtención de un curso
        // En un caso real, se accedería a la base de datos para obtener el curso
        DTOCurso curso = new DTOCurso();
        curso.setId("1");
        curso.setNombre("Curso de Spring Boot");
        curso.setDescripcion("Un curso completo sobre Spring Boot");
        curso.setFechaInicio("2023-01-01");
        return curso;
    }

    @GetMapping("/trm")
    public String getTRM() {
        return "TRM: " + TRM;
    }

    @GetMapping("/filter")
    public String filter(@RequestParam String param) {
        return "Retornar con filtro: " + param;
    }
    

    @PostMapping("/crear")
    public DTOPersona crear(@RequestBody DTOPersona entity) {
        //TODO: process POST request
        // acceder a BD y guardar el entity
        entity.setId("12345"); // Simular la asignación de un ID
        return entity;
    }



    @DeleteMapping("/eliminar")
    public String eliminar(@RequestParam String id) {
        // Elimintar el registro con el id proporcionado
        return "Hello, World 3!";
    }

    @PutMapping("path/{id}")
    public String actualizar(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }


}
