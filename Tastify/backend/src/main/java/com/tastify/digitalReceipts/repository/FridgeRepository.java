package com.tastify.digitalReceipts.repository;

import com.tastify.digitalReceipts.model.FridgeItems;
import com.tastify.digitalReceipts.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FridgeRepository extends JpaRepository<FridgeItems, Long>, JpaSpecificationExecutor<Ingredients> {
}
