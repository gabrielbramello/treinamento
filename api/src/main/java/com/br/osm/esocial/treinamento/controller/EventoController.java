package com.br.osm.esocial.treinamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.br.osm.esocial.treinamento.entidades.Evento;

@RestController
public class EventoController {

	public List<Evento> listaEvento() {
		return new ArrayList<Evento>();
	}
	
	public ResponseEntity<Evento> insereEvento() {
		Evento evento = new Evento();
		return new ResponseEntity<Evento>(evento, HttpStatus.OK);
	}
	
	public ResponseEntity<Long> deletaEvento(Long idEvento) {
		return new ResponseEntity<Long>(idEvento, HttpStatus.OK);
	}

	public ResponseEntity<Evento> atualizaEvento(){
		Evento evento = new Evento();
		return new ResponseEntity<Evento>(evento, HttpStatus.OK);
	}
	
}
