package com.loooz.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;







import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.loooz.bo.DiagnoseRecord;
import com.loooz.bo.Patient;
import com.loooz.constants.DiagnoseState;
import com.loooz.exception.DiagnoseRecordException;
import com.loooz.exception.PatientOperationException;
import com.loooz.service.DiagnoseRecordService;
import com.loooz.service.PatientService;
import com.loooz.util.ResultUtil;
import com.loooz.vo.JsonResult;
import com.sun.org.glassfish.gmbal.ParameterNames;

@Controller
public class PatientController {
    
    @Resource
    private PatientService patientService;
    
    @Resource
    private DiagnoseRecordService drService;
    
    //注册
    // http://110.249.163.146:8081/Hospital/regiserPatient?info={name：？，cellphone：？，idcard:?,aid:?}
    @RequestMapping(value = "/regiserPatient",method=RequestMethod.GET)
    public @ResponseBody JsonResult regiserPatinet(@RequestParam("pinfo")String patient){
        
        System.out.println("注册信息："+patient);
        
        JSONObject pInfoJson = JSONObject.fromObject(patient);
        
        Patient p = new Patient();
        //姓名
        if(pInfoJson.has("name")){
            p.setName(pInfoJson.getString("name"));
        }

        //电话
        if(pInfoJson.has("cellphone")){
            p.setCellphone(pInfoJson.getString("cellphone"));
        }
        
        //身份证号
        if(pInfoJson.has("idcard")){
            p.setCellphone(pInfoJson.getString("idcard"));
        }
        
        //支付宝ID
        if(pInfoJson.has("aid")){
            p.setAid(pInfoJson.getString("aid"));
        }
        
        JsonResult res = null;
        try {
            patientService.addPatient(p);
            res = ResultUtil.parseToView("注册成功");
        } catch (PatientOperationException e) {
           res = ResultUtil.parseToView(e);
        }
        return res;
    }
    
    @RequestMapping(value="/getPatientById",method=RequestMethod.GET)
    public @ResponseBody JsonResult getPatientInfo(@RequestParam("pid") long pid){
        
        Patient patient = patientService.getPatientById(pid);
        JsonResult res = ResultUtil.parseToView(patient);
        return res;
    }
    
    //修改病人信息
    //info={pid：？，name：？，cellphone：？，idcard:?,aid:?}
    @RequestMapping(value="/alertPatient",method=RequestMethod.GET)
    public @ResponseBody JsonResult alertPatientInfoById(@RequestParam("info") String pInfo){
        JSONObject pJson = JSONObject.fromObject(pInfo);
        JsonResult res = null;
        try {
            patientService.updatePatient(pJson);
            res = ResultUtil.parseToView("修改成功");
        } catch (PatientOperationException e) {
            res = ResultUtil.parseToView(e);
        }
        return res;
    }
    
    //获取病人信息列表
    @RequestMapping(value="/getAllPatient",method=RequestMethod.GET)
    public @ResponseBody JsonResult getPatientList(){
       List<Patient> data = patientService.getAllPatientInfo(); 
       JsonResult res = ResultUtil.parseToView(data);
       return res;
    }
    
    //根据aid获取相关的患者
    @RequestMapping(value="/getListByAid", method=RequestMethod.GET)
    public @ResponseBody JsonResult getPatientListByAid(@RequestParam("aid")String aid){

        System.out.println(aid);
        Assert.notNull(aid, "aid为空");
        Assert.hasLength(aid, "aid不能为空");
        
        List<Patient> pListByAid = patientService.getPatientListByAid(aid);
        
        JsonResult res = ResultUtil.parseToView(pListByAid); 
        
        return res;
    }
    
    
    //挂号
    @RequestMapping(value="/registration",method=RequestMethod.GET)
    public @ResponseBody JsonResult registration(@RequestParam("pid") long pid,@RequestParam("type")int type){
       
        DiagnoseRecord dr = new DiagnoseRecord();
       
        System.out.println(pid);
        
        Assert.isTrue(pid > 0, "pid不正确");
        Assert.isTrue(type > 0, "type不正确");
        
        dr.setPid(pid);
        dr.setDiagnose_type(type);
        dr.setState(DiagnoseState.REGISTRATION.getState());
        dr.setStart_time(new Date());
        drService.registrationService(dr);
        JsonResult res = ResultUtil.parseToView("挂号成功");
       
        return res;
    }
    
    @RequestMapping(value="/diagnoseDone",method=RequestMethod.GET)
    public @ResponseBody JsonResult diagnoseDone(@RequestParam("drid")long drid){
        
        JsonResult res = null;
        try {
            drService.diagnoseDoneService(drid);
        } catch (DiagnoseRecordException e) {
            e.printStackTrace();
            res = ResultUtil.parseToView(e);
        }
        
        return res;
        
    } 
    
    
    @RequestMapping(value="/patienttest",method=RequestMethod.GET)
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        System.out.println("Patient controller");
        mv.addObject("patient", "patient controller");
        mv.setViewName("index");
        return mv;
    }
    
    
}
