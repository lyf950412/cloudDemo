package github.lyf.controller;

import github.lyf.service.OrderFeignService;
import github.lyf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyf
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderFeignService orderFeignService;
    @GetMapping("/create/{orderID}/{orderNum}")
    public String order(@PathVariable String orderID, @PathVariable String orderNum){
        return orderFeignService.create(orderID,orderNum);
    }
}
