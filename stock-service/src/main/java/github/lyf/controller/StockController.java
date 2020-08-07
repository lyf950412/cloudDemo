package github.lyf.controller;

import github.lyf.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyf
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    StockService stockService;
    @GetMapping("/create/{orderID}/{orderNum}")
    public String order(@PathVariable String orderID, @PathVariable String orderNum){
        return stockService.create(orderID,orderNum);
    }
}
