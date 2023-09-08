package pro.sky.coursework2.service;

import org.springframework.stereotype.Service;
import pro.sky.coursework2.Exception.AmountMoreThanRequiredException;
import pro.sky.coursework2.entity.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        if (amount < 0 || amount > questionService.getAll().size()) {
            throw new AmountMoreThanRequiredException();
        }
        Set<Question> exam = new HashSet<>();
        while (exam.size() < amount) {
            exam.add(questionService.getRandomQuestion());

        }
        return exam;
    }
}
