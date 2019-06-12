package task3wiki;

import java.util.ArrayDeque;
import java.util.Deque;

public class WikiPrototype implements Cloneable {
  private Deque<String> articleText;

  WikiPrototype(String inputText, long timestamp) {
    articleText = new ArrayDeque<>();
    articleText.add(inputText + " with timestamp " + timestamp);
  }

  private WikiPrototype(Deque<String> savedArticleText) {
    articleText = savedArticleText;
  }

  void changeArticleText(String newArticleText) {
    articleText.add(" + " + newArticleText);
  }

  void printArticle() {
    System.out.println(articleText);
  }

  void removeLast() {
    articleText.remove(articleText.pollLast());
  }

  private Deque<String> getArticleTextHistory() {
    return articleText;
  }

  @Override
  public WikiPrototype clone() throws CloneNotSupportedException {
    Deque<String> tmp = new ArrayDeque<>(this.getArticleTextHistory());

    return new WikiPrototype(tmp);
  }
}
