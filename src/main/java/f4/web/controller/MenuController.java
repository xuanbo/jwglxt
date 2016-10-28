package f4.web.controller;

import f4.web.entity.Menu;
import f4.web.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试
 *
 * Created by xuan on 16-10-28.
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/selectByParentId", method = RequestMethod.GET)
    public List<Menu> selectByParentId(@RequestParam(required = false, defaultValue = "0") Integer parentId) {
        Menu menu = new Menu();
        menu.setParentId(parentId);
        return menuService.select(menu);
    }
}
