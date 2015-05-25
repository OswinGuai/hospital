package com.loooz.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loooz.exception.PatientOperationException;
import com.loooz.service.PatientCardBindService;
import com.loooz.util.ResultUtil;
import com.loooz.vo.JsonResult;

@Controller
public class CardController {
	
	@Resource
	private PatientCardBindService bindService;

	@RequestMapping(value = "/bind/{pid}", method = RequestMethod.GET)
    public @ResponseBody JsonResult applyBind(@PathVariable("pid") long pid) {
	    long id;
        try {
            id = bindService.generateBindCode(pid);
        } catch (PatientOperationException e) {
            return ResultUtil.parseToView(e);
        }
        return ResultUtil.parseToView(id);
    }
	
}