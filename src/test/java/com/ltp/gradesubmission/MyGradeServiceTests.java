package com.ltp.gradesubmission;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ltp.gradesubmission.pojo.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;
import com.ltp.gradesubmission.service.GradeService;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MyGradeServiceTests {

    @Mock
    private GradeRepository gradeRepository;

    @InjectMocks
    private GradeService gradeService;

    @Test
    public void gradeIndexTest() {
        // Arrange: Setup the mock behavior
        Grade grade = new Grade();
        when(gradeRepository.getGrades()).thenReturn(Arrays.asList(grade));

        // Act: Call the method under test
        List<Grade> grades = gradeService.getGrades();

        // Assert: Verify the behavior
        assertNotNull(grades, "The grades list should not be null");
        assertEquals(0, grades.size(), "The grades list should be empty");
    }
}
