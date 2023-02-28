package com.tastify.digitalReceipts.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RecipeUrlCreator {
    @Value("${myDefaultApiKey}")
    private String key;

    public String createURLWithKey(String url) {
        return url + "&apiKey=" + key;
    }
}
