package com.tastify.digitalReceipts.model;

import com.tastify.digitalReceipts.model.recipe.information.Aisle;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class Categories {
    private Aisle aisle;
}