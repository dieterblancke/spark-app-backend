package dev.endoy.spark.app.domain;

import lombok.Value;

import java.util.UUID;

@Value
public class Item {

    UUID id;
    String name;
    String description;
    int price;

}
