package org.generation.PandorasBox.service;

import org.generation.PandorasBox.repository.entity.productItem;

import java.util.List;

public interface ItemService {

    //save method is for 2 purposes - Create new item & Update existing item
    productItem save(productItem item);

    //Delete item from database - based on item Id
    void delete(int itemId);

    //Read all item from database
    List<productItem> all();

    //Read an item from database - based on item Id
    productItem findById(int itemId);
}
