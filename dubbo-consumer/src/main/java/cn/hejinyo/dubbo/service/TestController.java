package cn.hejinyo.dubbo.service;

import cn.hejinyo.dubbo.api.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : heshuangshuang
 * @date : 2018/7/17 17:23
 */
@RestController
@RequestMapping("/customer")
public class TestController {

    /*(url = "dubbo://127.0.0.1:20880", check = false)*/
    @Reference
    private DemoService demoService;

    @GetMapping("/{id}")
    public String test(@PathVariable Long id) {
        return demoService.getPermissions(id).toString();
    }

}