package cn.hejinyo.dubbo.api;

import java.util.List;

/**
 * @author : heshuangshuang
 * @date : 2018/7/17 14:34
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
