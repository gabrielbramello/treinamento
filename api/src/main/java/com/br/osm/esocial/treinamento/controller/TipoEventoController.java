package com.br.osm.esocial.treinamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.br.osm.esocial.treinamento.entidades.TipoEvento;

@RestController
public class TipoEventoController {

	public List<TipoEvento> listaTipoEvento() {
		return new ArrayList<TipoEvento>();
	}
}
