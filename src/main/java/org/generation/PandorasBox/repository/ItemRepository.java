package org.generation.PandorasBox.repository;

import org.generation.PandorasBox.repository.entity.productItem;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring
// CRUD refers Create, Read, Update, Delete
public interface ItemRepository extends CrudRepository<productItem, Integer>
{
}
