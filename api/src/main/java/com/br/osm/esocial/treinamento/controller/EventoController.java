package com.br.osm.esocial.treinamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.osm.esocial.treinamento.dto.EventoDTO;
import com.br.osm.esocial.treinamento.entidades.Evento;

@RestController
public class EventoController {

	@GetMapping(value="/evento")
	public List<Evento> listaEvento() {
		return new ArrayList<Evento>();
	}
	
	@PostMapping(value="/evento")
	public ResponseEntity<Evento> insereEvento(@RequestBody EventoDTO eventoDTO) {
		Evento evento = new Evento();
		return new ResponseEntity<Evento>(evento, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/evento/{id}")
	public ResponseEntity<Long> deletaEvento(@PathVariable(value = "id") Long idEvento) {
		return new ResponseEntity<Long>(idEvento, HttpStatus.OK);
	}

}
