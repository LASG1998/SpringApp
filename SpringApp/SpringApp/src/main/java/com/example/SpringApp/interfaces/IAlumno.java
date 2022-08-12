package com.example.SpringApp.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringApp.modelo.Alumno;

@Repository
public interface IAlumno extends CrudRepository<Alumno, Integer>{

}
