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

        for ( int i = 1; i <= 50; i++ )
        {
            this.items.add( new Item( i, "Item " + i, "Description of item " + i, i * 100 ) );
        }
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
