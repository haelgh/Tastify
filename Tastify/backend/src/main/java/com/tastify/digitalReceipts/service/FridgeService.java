package com.tastify.digitalReceipts.service;

import com.tastify.digitalReceipts.model.FridgeItems;
import com.tastify.digitalReceipts.repository.FridgeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
@AllArgsConstructor
public class FridgeService {

    private final FridgeRepository fridgeRepository;

    public void save(String title, Long userId) {
        FridgeItems ingr = new FridgeItems(title);
        fridgeRepository.save(ingr);
    }

    public List<FridgeItems> list() {
        return fridgeRepository.findAll();
    }

    public void delete(Long ingredientId) {
        fridgeRepository.deleteById(ingredientId);
    }
}
