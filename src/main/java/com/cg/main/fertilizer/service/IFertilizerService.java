package com.cg.main.fertilizer.service;

import java.util.List;

import com.cg.main.fertilizer.model.Fertilizer;
/**
 * Interface for Fertilizer service layer
 * @author Shweta
 *
 */


public interface IFertilizerService {
    /*
     *delete Fertilizer by using Id 
     */
	List<Fertilizer> deleteFertilizer(Integer productId);
	 /*
     * update Fertilizer
     */
	Fertilizer updateFertilizer(Fertilizer fertilizer);
	 /*
     * add Fertilizer
     */
	Fertilizer addFertilizer(Fertilizer fertilizer);
	 /*
     * get All Fertilizer
     */
	List<Fertilizer> getAllFertilizer();
	 /*
     * getFertilizer by productId
     */
	Fertilizer getFertilizer(Integer productId);
	 /*
     * getAllFertilizer by productName
     */
	List<Fertilizer> getAllFertilizer(String productName);
}