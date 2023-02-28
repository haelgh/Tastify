package com.tastify.digitalReceipts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FridgeItems {

    @Id
    @GeneratedValue
    private Long id;
    private String title;

    public FridgeItems(String title) {
        this.title = title;
    }
}