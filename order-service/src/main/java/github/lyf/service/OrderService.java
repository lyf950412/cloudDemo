package github.lyf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lyf
 */
@Service
public class OrderService {
    @Autowired
    RestTemplate restTemplate;
    public String create(String orderID,String orderNum){
      return  restTemplate.getForObject("http://stock-service:9001/stock/create/"+orderID+"/"+orderNum,String.class);
    }
}
