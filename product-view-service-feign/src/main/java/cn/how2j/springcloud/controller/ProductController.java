package cn.how2j.springcloud.controller;

import cn.how2j.springcloud.feign.ProductClientFeign;
import cn.how2j.springcloud.pojo.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {
    ProductClientFeign productClientFeign;
    @RequestMapping("/products")
    public Object products() {
        List<Product> ps = productClientFeign.listProdcuts();
        return ps;
    }
}
