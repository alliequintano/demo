package com.allieanddavid;

import org.h2.command.dml.Select;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =  {Config.class})
public class ItemRepositoryTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    ItemRepository itemRepository;

    @Test
    public void shouldAddItemToDatabase() {
        Item item = new Item("123");
        itemRepository.save(item);

        Item one = itemRepository.findOne("123");
        assertNotNull(one);

//        TODO: better assertion here.
//        one.getId();
//
//        assertTrue("should find item row",
//                jdbcTemplate.queryForRowSet("SELECT ID FROM ITEMS WHERE ID = '123'").next());
    }

}