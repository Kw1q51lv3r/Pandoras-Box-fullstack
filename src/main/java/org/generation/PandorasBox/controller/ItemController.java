package org.generation.PandorasBox.controller;

import org.generation.PandorasBox.component.FileUploadUtil;
import org.generation.PandorasBox.controller.dto.ItemDto;
import org.generation.PandorasBox.repository.entity.productItem;
import org.generation.PandorasBox.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/productItem")
public class ItemController {

    @Value("${image.folder}")
    private String imageFolder;


    final ItemService itemService;

    public ItemController(@Autowired ItemService itemService) {
        this.itemService = itemService;
    }

    @CrossOrigin
    @GetMapping("/all")
    public Iterable<productItem> getItems() {
        return itemService.all();
    }


    @CrossOrigin
    @GetMapping("/{productID}")
    public productItem findItemById(@PathVariable Integer productID) {
        return itemService.findById(productID);
    }

    @CrossOrigin
    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemService.delete( id );
    }

// post method - API endpoint for POST HTTP request from the client

    @CrossOrigin
    @PostMapping("/add")
    public void save(
            @RequestParam(name="productName", required = true) String productName,
                       @RequestParam(name="productPrice", required = true) Integer productPrice,
                       @RequestParam(name="productDescription", required = true) String productDescription,
                       @RequestParam(name="productTrivia", required = true) String productTrivia,
                       @RequestParam(name="productImgURL", required = true) String productImgURL,
                       @RequestParam(name="productDelivery", required = true) Integer productDelivery,
                       @RequestParam(name="productRemarks", required = true) String productRemarks,
                       @RequestParam(name="productCategory", required = true) String productCategory,
                       @RequestParam("imagefile") MultipartFile multipartFile) throws IOException {

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        FileUploadUtil.saveFile(imageFolder, fileName, multipartFile);


        //save all the records in mySQL database
        String fullPath = imageFolder + "/" + productImgURL;
        ItemDto itemDto = new ItemDto(productName, productPrice, productDescription, productTrivia, fullPath, productDelivery, productRemarks, productCategory);
        itemService.save(new productItem(itemDto));
    }




}

