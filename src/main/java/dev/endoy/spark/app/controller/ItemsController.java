package dev.endoy.spark.app.controller;

import dev.endoy.spark.app.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemsController {

    private final ItemService itemService;

    @GetMapping
    public List<ItemDTO> getItems() {
        return itemService.getItems()
                .stream()
                .map(item -> new ItemDTO(item.getId(), item.getName(), item.getDescription(), item.getPrice()))
                .toList();
    }

    @Value
    public static class ItemDTO {

        long id;
        String name;
        String description;
        int price;

    }
}
