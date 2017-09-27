package net.chinanets.sj.controller;

import net.chinanets.sj.service.CommonService;
import net.chinanets.sj.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public JsonResult getAccountById(@PathVariable("id") Integer id) throws Exception {

//        int j = 2/0;

        return new JsonResult(true, commonService.getCount());
//        return new JsonResult(true, commonService.getCpwsById(id));
    }


}