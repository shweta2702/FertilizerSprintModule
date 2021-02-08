package com.cg.main.fertilizer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.main.fertilizer.model.Fertilizer;
import com.cg.main.fertilizer.repository.FertilizerRepository;

/**
 * Fertilizer Service class implements Interface Fertilizer Service class
 * 
 * @author Shweta
 *
 */
@Service // Indicates that an annotated class is a "Service"
@Transactional // Describes a transaction attribute on an individual method or on a class
public class FertilizerService implements IFertilizerService {

	@Autowired
	FertilizerRepository repository;

	/*
	 * method to getFertilizer by product id
	 */
	@Override
	public Fertilizer getFertilizer(Integer productId) {
		return repository.findById(productId).orElse(null);
	}

	/*
	 * method to getAllFertilizer
	 */
	@Override
	public List<Fertilizer> getAllFertilizer() {
		return repository.findAll();
	}

	/*
	 * method to getFertilizer by product id
	 */
	@Override
	public Fertilizer addFertilizer(Fertilizer fertilizer) {
		return repository.save(fertilizer);
	}

	/*
	 * method to getAllFertilizer by productName
	 */
	@Override
	public List<Fertilizer> getAllFertilizer(String productName) {
		return repository.findAllByProductName(productName);
	}

	/*
	 * method to updateFertilizer list
	 */
	@Override
	public Fertilizer updateFertilizer(Fertilizer fertilizer) {
		return repository.save(fertilizer);
	}

	/*
	 * method to deleteFertilizer by product id
	 */
	@Override
	public List<Fertilizer> deleteFertilizer(Integer productId) {
		List<Fertilizer> list = new ArrayList<>();
		Fertilizer f = repository.findById(productId).orElse(null);
		if (f == null) {
			return list;

		} else {
			repository.deleteById(productId);
			return repository.findAll();
		}
	}

}
