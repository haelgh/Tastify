package com.tastify.digitalReceipts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public AppUser(String name){
        this.name = name;
    }



    @OneToMany()
    private List<FavoriteRecipes> recipes;

    @OneToMany()
    private List<FridgeItems> fridge;

}