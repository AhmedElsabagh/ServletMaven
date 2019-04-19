package Model;

import Model.QuizQuestion;
import java.util.ArrayList;
import java.util.List;

public class Quiz {

  private List<QuizQuestion> questions;
  private List<Integer> randomLst;

  public Quiz()
  {
    questions = new ArrayList<>();
    questions.add(new QuizQuestion("3, 1, 4, 1, 5","9","PI"));
    questions.add(new QuizQuestion("1, 1, 2, 3, 5","8","fibonacci"));
    questions.add(new QuizQuestion("1, 4, 9, 16, 25","36","squares"));
    questions.add(new QuizQuestion("2, 3, 5, 7, 11","13","primes"));
    questions.add(new QuizQuestion("1, 2, 4, 8, 16","32","power of 2"));

    randomLst = new ArrayList<Integer>();
  }

  public void addQuestion(QuizQuestion q)
  {
    questions.add(q);
  }

  public List<QuizQuestion> getQuizQuestions()
  {
    return questions;
  }

  public QuizQuestion getRandomQuizQuestion()
  {
    int max = questions.size();
    int min = 0;
    int range = max - min + 1;

    if(randomLst.size() == questions.size())
      return null;

    int index = (int)(Math.random() * range) + min;

    while(true)
    {
      if(randomLst.contains(index) || index >= questions.size())
      {
        index = (int)(Math.random() * range) + min;
      }
      else
      {
        randomLst.add(index);
        break;
      }
    }

    return questions.get(index);
  }

  public int getScore()
  {
    int score =0;
    QuizQuestion q ;
    for(int i = 0; i < questions.size();i++)
    {
      q = questions.get(i);
      if(q.getUserAnswer().equals("")) continue;
      if(q.getAnswer().trim().equals(q.getUserAnswer().trim()))
      {
        score +=1;
      }
    }

    return score;
  }

  public void setQuestionAnswer(QuizQuestion q)
  {
    questions.get(questions.indexOf(q)).setUserAnswer(q.getUserAnswer());
  }

  public int getSize()
  {
    return questions.size();
  }

}
