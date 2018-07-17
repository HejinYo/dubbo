package cn.hejinyo.dubbo.service.impl;

import cn.hejinyo.dubbo.api.DemoService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : heshuangshuang
 * @date : 2018/7/17 14:36
 */
@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
