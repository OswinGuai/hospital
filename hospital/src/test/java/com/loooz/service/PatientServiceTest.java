package com.loooz.service;

import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.loooz.bo.Patient;
import com.loooz.dao.PatientDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:conf/applicationContext-test.xml")
public class PatientServiceTest {
   
    private PatientService patientService;
    
    @Mock
    private PatientDao patientDao;
    
    @Before
    public void initTest(){
        MockitoAnnotations.initMocks(this); 
    }
    
    
    
}
