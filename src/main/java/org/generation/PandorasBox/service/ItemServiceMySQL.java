package org.generation.PandorasBox.service;

import org.generation.PandorasBox.repository.ItemRepository;
import org.generation.PandorasBox.repository.entity.productItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemServiceMySQL implements ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceMySQL( @Autowired ItemRepository itemRepository ) { this.itemRepository = itemRepository;}

    @Override
    public productItem save(productItem item)
    {
        return itemRepository.save(item);
    }

    @Override
    public void delete( int itemId )
    {
        itemRepository.deleteById( itemId );
    }

    @Override
    public List<productItem> all()
    {
        List<productItem> result = new ArrayList<>();
        itemRepository.findAll().forEach( result::add );
        return result;
    }

    @Override
    public productItem findById( int itemId )
    {
        //TODO implement this method
        Optional<productItem> item = itemRepository.findById( itemId );
        productItem itemResponse = item.get();
        return itemResponse;
    }


}
