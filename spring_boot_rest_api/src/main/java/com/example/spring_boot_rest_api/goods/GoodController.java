package com.example.spring_boot_rest_api.goods;

import com.example.spring_boot_rest_api.exception.RestApiInvalidDataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("v1/goods")
public class GoodController {

    private final static Logger logger = LoggerFactory.getLogger(GoodController.class);

    private final GoodService goodService;

    @Autowired
    public GoodController(GoodService goodService) {
        this.goodService = goodService;
    }

    @PostMapping(path = "item")
    public void add(@Valid @RequestBody Good good, BindingResult bindingResult) {
        logger.info("Validation: " + bindingResult.hasErrors());
        if (bindingResult.hasErrors()) {
            logger.error("Invalid");
            throw new RestApiInvalidDataException();
        }
        logger.info("After check");
        goodService.add(good);
    }

    @PostMapping(path = "items")
    public void add(@Valid @RequestBody List<Good> goods, BindingResult bindingResult) {
        logger.info("Validation: " + bindingResult.hasErrors());
        if (bindingResult.hasErrors()) {
            logger.error("Invalid");
            throw new RestApiInvalidDataException();
        }
        logger.info("After check");
        goodService.add(goods);
    }
}
