package com.example.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringApp.interfaceService.IAlumnoService;
import com.example.SpringApp.interfaces.IAlumno;
import com.example.SpringApp.modelo.Alumno;

@Service
public class AlumnoService implements IAlumnoService{
	
	@Autowired
	private IAlumno data;
	
	@Override
	public List<Alumno> listar() {
		return (List<Alumno>)data.findAll();
		
	}

	@Override
	public Optional<Alumno> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Alumno a) {
		int res=0;
		Alumno alumno=data.save(a);
		if(!alumno.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
