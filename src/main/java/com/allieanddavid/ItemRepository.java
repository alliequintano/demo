package com.allieanddavid;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by alexandraquintano on 3/7/17.
 */
public interface ItemRepository extends CrudRepository<Item, String> {
}
