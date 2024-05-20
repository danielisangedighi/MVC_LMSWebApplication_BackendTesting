package com.ltp.gradesubmission;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ltp.gradesubmission.pojo.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;
import com.ltp.gradesubmission.service.GradeService;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.List;


//Initializing the Runner Class
@RunWith(MockitoJUnitRunner.class)
public class MyGradeServiceTests {
    
    //Mock the Dependency Object
    @Mock
    private GradeRepository gradeRepository;

    //Inject the Mock into the Service object to be tested.
    @InjectMocks
    private GradeService gradeService;

    @Test

    public String gradeIndexTest() {
        when(gradeRepository.getGrades()).thenReturn(Arrays.asList());
            return "GradeRepository()";

        gradeService.getGrades();

    }

    asser
}
