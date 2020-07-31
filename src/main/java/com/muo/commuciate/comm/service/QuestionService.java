package com.muo.commuciate.comm.service;

import com.muo.commuciate.comm.dto.QuestionDTO;
import com.muo.commuciate.comm.mapper.QuestionMapper;
import com.muo.commuciate.comm.mapper.UserMapper;
import com.muo.commuciate.comm.model.Question;
import com.muo.commuciate.comm.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
           /* questionDTO.setId(question.getId());*/
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}
