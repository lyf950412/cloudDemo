package github.lyf.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lyf
 */
@FeignClient(value = "stock-service")
public interface OrderFeignService {
     @GetMapping("/stock/create/{orderID}/{orderNum}")
     String create(@PathVariable("orderID") String orderID, @PathVariable("orderNum") String orderNum);
}
