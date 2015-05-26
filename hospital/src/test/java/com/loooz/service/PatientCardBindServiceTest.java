/**
 * 
 */
package com.loooz.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.loooz.bo.PatientCardBind;
import com.loooz.dao.PatientCardBindDao;
import com.loooz.exception.CardOperationException;
import com.loooz.exception.PatientOperationException;
import com.loooz.service.impl.PatientCardBindServiceImpl;

/**
 * @description
 * @author Pei Zhongyi
 * @date 2015年5月25日 下午3:23:59
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:conf/applicationContext-test.xml")
public class PatientCardBindServiceTest {

    @InjectMocks
    private PatientCardBindService service = new PatientCardBindServiceImpl();

    @Mock
    private PatientService patientService;

    @Mock
    private PatientCardBindDao patientCardBindDao;

    @Before
    public void initTest() {

        MockitoAnnotations.initMocks(this);
        
        Mockito.doAnswer(new Answer<Boolean>() {
            public Boolean answer(InvocationOnMock invocation) {
                Object[] args = invocation.getArguments();
                Long num = (Long) args[0];
                /**
                 * 假设id小于5的患者都不存在
                 */
                if (num < 5) {
                    return false;
                } else {
                    return true;
                }
            }
        }).when(patientService).checkExists(Mockito.anyLong());

        Mockito.doAnswer(new Answer<PatientCardBind>() {
            public PatientCardBind answer(InvocationOnMock invocation) {
                Object[] args = invocation.getArguments();
                Long num = (Long) args[0];
                /**
                 * 假设id小于20的患者都已经绑定
                 */
                if (num < 20) {
                    PatientCardBind bind = new PatientCardBind();
                    return bind;
                } else {
                    return null;
                }
            }
        }).when(patientCardBindDao).selectBindRecordByPatientId(Mockito.anyLong());
        
        Mockito.doAnswer(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                Object[] args = invocation.getArguments();
                PatientCardBind bind = (PatientCardBind) args[0];
                bind.setBindCode(333);
                return 0;
            }
        }).when(patientCardBindDao).insertBindRecord(Mockito.any(PatientCardBind.class));
        
    }

    @Test
    public void testGenerateBindCode() {
        long patientId = 6;
        boolean error = false;
        try {
            service.generateBindCode(patientId);
        } catch (CardOperationException e) {
            /**
             * 已经绑定的情况，应该报异常
             */
            error = true;
        } catch (PatientOperationException e) {
            error = false;
        }
        Assert.assertTrue(error);
        
        patientId = 21;
        error = false;
        long id = 0;
        try {
            id = service.generateBindCode(patientId);
        } catch (PatientOperationException e) {
            /**
             * 未绑定的情况，不应该报异常
             */
            error = true;
        } catch (CardOperationException e) {
            error = true;
        }
        Assert.assertTrue(!error);
        Assert.assertTrue(id > 0);
        
    }

}
