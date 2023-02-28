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
public class FavoriteRecipes {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Long serviceId;

    public FavoriteRecipes(String title, Long serviceId) {
        this.title = title;
        this.serviceId = serviceId;
    }
}
