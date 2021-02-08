package com.cg.main.fertilizer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.main.fertilizer.model.Fertilizer;
/**
 * FertilizerRepository class extends JpaRepository
 * @author Shweta
 *
 */

@Repository //Indicates that an annotated class is a "Repository"
public interface FertilizerRepository extends JpaRepository<Fertilizer, Integer> {
	/*
	 * method to findAllByProductName
	 */
	public List<Fertilizer> findAllByProductName(String productName);

}
