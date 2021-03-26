package com.emersonluiz.cadastroVacina.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emersonluiz.cadastroVacina.domain.GruposPrioritarios;
import com.emersonluiz.cadastroVacina.repository.GruposPrioritariosRepository;

@RestController
@RequestMapping("/grupos-prioridades")
public class GruposPrioridadesResource {
	
	@Autowired
	private GruposPrioritariosRepository gruposPrioridadesRepository;
	
	@GetMapping
	public List<GruposPrioritarios> listarTodos(){
		return gruposPrioridadesRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public GruposPrioritarios buscarPeloCodigo(@PathVariable Long codigo) {
		return gruposPrioridadesRepository.findById(codigo).orElse(null);
	}
	
}