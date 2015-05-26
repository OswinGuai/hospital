package com.loooz.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loooz.exception.BaseException;
import com.loooz.exception.CardOperationException;
import com.loooz.service.PatientCardBindService;
import com.loooz.util.ResultUtil;
import com.loooz.vo.JsonResult;

@Controller
@RequestMapping("/card")
public class CardController {
	
	@Resource
	private PatientCardBindService bindService;

	@RequestMapping(value = "apply/{pid}", method = RequestMethod.GET)
    public @ResponseBody JsonResult applyBind(@PathVariable("pid") long pid) {
	    long id;
        try {
            id = bindService.generateBindCode(pid);
        } catch (BaseException e) {
            return ResultUtil.parseToView(e);
        } 
        return ResultUtil.parseToView(id);
    }
	
	@RequestMapping(value = "bind/{bindCode}/{cardId}", method = RequestMethod.POST)
    public @ResponseBody JsonResult bindCard(@PathVariable("bindCode") long bindCode, @PathVariable("cardId") String cardId) {
	    try {
            bindService.bindCard(bindCode, cardId);
        } catch (CardOperationException e) {
            return ResultUtil.parseToView(e);
        }
        return ResultUtil.parseToView("");
    }
	
}