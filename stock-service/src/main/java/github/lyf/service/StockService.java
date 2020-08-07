package github.lyf.service;


import org.springframework.stereotype.Service;

/**
 * @author lyf
 */
@Service
public class StockService {
    public String create(String orderID,String orderNum){
        System.out.println("商品id:"+orderID+",减库存:"+orderNum);
        return "success";
    }
}
