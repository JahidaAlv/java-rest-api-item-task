package com.jahida.itemapi.controller;

import com.jahida.itemapi.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private List<Item> itemList = new ArrayList<>();

    // Add new item
    @PostMapping
    public String addItem(@RequestBody Item item) {

        // Input validation
        if (item.getName() == null || item.getName().isEmpty()) {
            return "Item name is required";
        }
        if (item.getDescription() == null || item.getDescription().isEmpty()) {
            return "Item description is required";
        }

        itemList.add(item);
        return "Item added successfully";
    }

    // Get item by ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        for (Item item : itemList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
