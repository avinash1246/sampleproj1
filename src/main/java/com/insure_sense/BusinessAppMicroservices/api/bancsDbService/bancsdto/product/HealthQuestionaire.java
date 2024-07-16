package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.Answer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class HealthQuestionaire {
    private Attribute question;
    private List<Answer> answer;
    private List<HealthQuestionaire> childQuestionaire;
    private Attribute parentQuestion;
    private Answer ParentAnswer;

    public Attribute getQuestion() {
        return question;
    }

    public void setQuestion(Attribute question) {
        this.question = question;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public List<HealthQuestionaire> getChildQuestionaire() {
        return childQuestionaire;
    }

    public void setChildQuestionaire(List<HealthQuestionaire> childQuestionaire) {
        this.childQuestionaire = childQuestionaire;
    }

    public Attribute getParentQuestion() {
        return parentQuestion;
    }

    public void setParentQuestion(Attribute parentQuestion) {
        this.parentQuestion = parentQuestion;
    }

    public Answer getParentAnswer() {
        return ParentAnswer;
    }

    public void setParentAnswer(Answer parentAnswer) {
        ParentAnswer = parentAnswer;
    }
}
