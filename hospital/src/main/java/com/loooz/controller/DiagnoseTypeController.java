/**
 * 
 */
package com.loooz.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loooz.bo.DiagnoseType;
import com.loooz.service.DiagnoseTypeService;
import com.loooz.util.ResultUtil;
import com.loooz.vo.JsonResult;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月30日 下午2:19:14
 *
 */
@Controller
public class DiagnoseTypeController {

    @Resource
    private DiagnoseTypeService diagnoseTypeService;
    
    @RequestMapping(value = "/rootTypes", method = RequestMethod.GET)
    public @ResponseBody JsonResult getRootTypes() {
        List<DiagnoseType> rootTypes = diagnoseTypeService.getRootTypes();
        return ResultUtil.parseToView(rootTypes);
    }
    
    @RequestMapping(value = "/subTypes", method = RequestMethod.GET)
    public @ResponseBody JsonResult getSubTypes(@RequestParam("parentId") int parentId) {
        List<DiagnoseType> subTypes = diagnoseTypeService.getSubTypes(parentId);
        return ResultUtil.parseToView(subTypes);
    }
}
