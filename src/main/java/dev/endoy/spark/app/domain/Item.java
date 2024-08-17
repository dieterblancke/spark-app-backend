package dev.endoy.spark.app.domain;

import lombok.Value;

@Value
public class Item
{

    long id;
    String name;
    String description;
    int price;

}
