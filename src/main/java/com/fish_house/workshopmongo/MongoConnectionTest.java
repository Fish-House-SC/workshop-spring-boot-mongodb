package com.fish_house.workshopmongo;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;

public class MongoConnectionTest {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017/workshop_mongo";
        try {
            ConnectionString connString = new ConnectionString(uri);
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connString)
                    .build();
            System.out.println("URI is valid: " + uri);
        } catch (Exception e) {
            System.out.println("Invalid URI: " + e.getMessage());
        }
    }
}