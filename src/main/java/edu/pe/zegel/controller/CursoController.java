package edu.pe.zegel.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import edu.pe.zegel.model.Curso;
import edu.pe.zegel.repository.CursoRepository;

@RestController
@RequestMapping("/api/v1")
public class CursoController {
	
	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping("/obtenerTodosCursos")
	public List<Curso> obtenerTodosCursos() {
		return cursoRepository.findAll();
	}
    @PostMapping("/crearCurso")
    public Curso crearCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }
    @GetMapping("/obtenerCurso/{id}")
    public ResponseEntity<Optional<Curso>> obtenerCursoPorId(
    		@PathVariable(value = "id") long idCurso)
    {
        Optional<Curso> objcurso = cursoRepository.findById(idCurso);        		
        return ResponseEntity.ok().body(objcurso);
    }
    @DeleteMapping("/eliminarCurso/{id}")
    public Map<String, Boolean> eliminarCurso(
    		@PathVariable(value = "id")long idCurso)
    {
        cursoRepository.deleteById(idCurso);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
