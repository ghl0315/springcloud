package cn.how2j.springcloud.feign;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign {
    @Override
    public List<Product> listProdcuts() {
        return null;
    }
}
