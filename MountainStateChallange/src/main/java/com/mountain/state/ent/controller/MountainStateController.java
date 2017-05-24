package com.mountain.state.ent.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mountain.state.ent.service.Mutiples;

@RestController
public class MountainStateController {

	@Autowired
	Mutiples multiples;

	@RequestMapping(value = "/getmultiples/{parameter1}/{parameter2}", method = RequestMethod.GET, produces = "applicaton/json")
	public String getMutiples(@PathVariable("parameter1") int parameter1, @PathVariable("parameter2") int parameter2) {
		Map<Integer, String> resultMap = new TreeMap<>();

		resultMap = multiples.printMulples(parameter1, parameter2);

		Gson gson = new Gson();
		return gson.toJson(resultMap);

	}

}
