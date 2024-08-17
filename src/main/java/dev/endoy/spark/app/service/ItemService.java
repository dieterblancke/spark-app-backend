package dev.endoy.spark.app.service;

import dev.endoy.spark.app.domain.Item;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {

    private final List<Item> items;

    public ItemService() {
        this.items = new ArrayList<>();
        this.items.add(new Item(UUID.randomUUID(), "Item 1", "Description 1", 100));
        this.items.add(new Item(UUID.randomUUID(), "Item 2", "Description 2", 200));
        this.items.add(new Item(UUID.randomUUID(), "Item 3", "Description 3", 300));
        this.items.add(new Item(UUID.randomUUID(), "Item 4", "Description 4", 400));
        this.items.add(new Item(UUID.randomUUID(), "Item 5", "Description 5", 500));
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(this.items);
    }
}
