package com.ltp.gradesubmission;

//imported by junit dependency
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ltp.gradesubmission.repository.GradeRepository;
import com.ltp.gradesubmission.service.GradeService;

//Mockito RunWith initializes the Runner Test Class
@RunWith(MockitoJUnitRunner.class)
public class GradeServiceTest {
    
    //Mocking the Class to be tested
    @Mock
    private GradeRepository gradeRepository;

    //Injecting the mock
    @InjectMocks
    private GradeService gradeService;
}
