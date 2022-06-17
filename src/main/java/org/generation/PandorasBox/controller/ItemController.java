package org.generation.PandorasBox.controller;

import org.generation.PandorasBox.repository.entity.*;
import org.generation.PandorasBox.service.*;
import org.generation.PandorasBox.controller.dto.ItemDto;
import org.generation.PandorasBox.component.FileUploadUtil;

import org.springframework.beans.factory.annotation.*;
import org.springframework.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import java.io.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Value("${image.folder}")
    private String imageFolder;

    final ItemService itemService;

    public ItemController( @Autowired ItemService itemService )
    {
        this.itemService = itemService;
    }

    @CrossOrigin
    @GetMapping( "/all" )
    public Iterable<Item> getItems()
    {
        return itemService.all();
    }

    @CrossOrigin
    @GetMapping( "/{id}" )
    public Item findItemById( @PathVariable Integer id )
    {
        return itemService.findById( id );
    }

    @CrossOrigin
    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemService.delete( id );
    }

    @CrossOrigin
    @PostMapping("/add")
    public void save(  @RequestParam(name="name", required = true) String name,
                       @RequestParam(name="id", required = true) String id,
                       @RequestParam(name="price", required = true) Integer price,
                       @RequestParam(name="description", required = true) String description,
                       @RequestParam(name="trivia", required = true) String trivia,
                       @RequestParam(name="imageUrl", required = true) String imageUrl,
                       @RequestParam(name="recoDelivery", required = true) Integer recoDelivery,
                       @RequestParam(name="remarks", required = true) String remarks,
                       @RequestParam(name="category", required = true) String category,
                       @RequestParam("imagefile") MultipartFile multipartFile) throws IOException {

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        FileUploadUtil.saveFile(imageFolder, fileName, multipartFile);

        String fullPath = imageUrl;
        ItemDto itemDto = new ItemDto(name, id, price, description, trivia, imageUrl, recoDelivery, remarks, category);
        itemService.save(new Item(itemDto));
    }


}
