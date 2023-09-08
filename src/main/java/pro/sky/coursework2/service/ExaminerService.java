package pro.sky.coursework2.service;

import pro.sky.coursework2.entity.Question;

import java.util.Collection;

public interface ExaminerService {
   Collection<Question> getQuestion(int amount);
}
