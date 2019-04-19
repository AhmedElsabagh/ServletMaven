package Model;

import java.security.PrivateKey;

public class QuizQuestion {

  private String question;
  private String answer;
  private String desc;

  private String userAnswer;

  public QuizQuestion(String question, String answer,String desc) {
    this.question = question;
    this.answer = answer;
    this.desc = desc;
    this.userAnswer = "";
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public String getDesc() { return desc; }

  public void setDesc(String desc) { this.desc = desc; }

  public String getUserAnswer() {
    return userAnswer;
  }

  public void setUserAnswer(String userAnswer) {
    this.userAnswer = userAnswer;
  }
}
