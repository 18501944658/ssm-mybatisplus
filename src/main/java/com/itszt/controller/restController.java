package com.itszt.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itszt.dao.AdminviolationMapper;
import com.itszt.domain.Adminviolation;
import com.itszt.service.IAdminviolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class restController {


    @Autowired
    private AdminviolationMapper adminviolationMapper;

    @Autowired
    private IAdminviolationService adminviolationService;

    /**
     * 通用方法
     *
     * @return
     */
    @RequestMapping(value = "/hehe", method = RequestMethod.GET)
    public List<Adminviolation> get() {
        Map<String, Object> map = new HashMap<>();
        map.put("keyid", 1060340055);
        List<Adminviolation> adminviolations = adminviolationMapper.selectByMap(map);
        return adminviolations;

    }

    /**
     * 自定义
     *
     * @return
     */
    @RequestMapping(value = "/haha", method = RequestMethod.GET)
    public Adminviolation get1() {
        Adminviolation getbykeyid = adminviolationMapper.getbykeyid(1060340055);
        return getbykeyid;

    }

    /**
     * 分页
     *
     * @return
     */
    @RequestMapping(value = "/heihei", method = RequestMethod.GET)
    public IPage<Adminviolation> get2(@RequestParam("page") Integer page) {
        IPage<Adminviolation> page1 = new Page<>();
        page1.setSize(10);
        page1.setCurrent(page);
        IPage<Adminviolation> page2 = adminviolationService.page(page1);
        return page2;
    }

    @RequestMapping(value = "/hengheng", method = RequestMethod.GET)
    public Map<String, Object> get3() {
        QueryWrapper<Adminviolation> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Adminviolation::getKeyid, 1060340055);
        Map<String, Object> map = adminviolationService.getMap(queryWrapper);
        return map;
    }

}
