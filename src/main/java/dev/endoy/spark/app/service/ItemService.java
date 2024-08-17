package dev.endoy.spark.app.service;

import dev.endoy.spark.app.domain.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ItemService
{

    private final List<Item> items;

    public ItemService()
    {
        this.items = new ArrayList<>();
        this.items.add( new Item( 1, "Item 1", "Description 1", 100 ) );
        this.items.add( new Item( 2, "Item 2", "Description 2", 200 ) );
        this.items.add( new Item( 3, "Item 3", "Description 3", 300 ) );
        this.items.add( new Item( 4, "Item 4", "Description 4", 400 ) );
        this.items.add( new Item( 5, "Item 5", "Description 5", 500 ) );
    }

    public List<Item> getItems( String searchText )
    {
        if ( searchText == null || searchText.isBlank() )
        {
            return Collections.unmodifiableList( this.items );
        }

        return this.items.stream()
            .filter( item -> item.getName().contains( searchText ) || item.getDescription().contains( searchText ) )
            .toList();
    }
}
