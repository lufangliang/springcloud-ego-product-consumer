package cn.itstudies.ego.consumer;

import cn.itstudies.service.ProductService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Farewell is well
 * @date 2019-12-05 09:32
 */
@FeignClient(name = "ego-product-provider")
public interface ConsumerService extends ProductService {

}
