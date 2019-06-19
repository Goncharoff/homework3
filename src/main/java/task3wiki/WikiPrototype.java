package task3wiki;

import java.util.ArrayDeque;
import java.util.Deque;

public class WikiPrototype implements Cloneable {
  private Deque<String> articleText;

  WikiPrototype(String inputText) {
    articleText = new ArrayDeque<>();
    articleText.add(inputText);
  }

  private WikiPrototype(Deque<String> savedArticleText) {
    articleText = savedArticleText;
  }

  void addTextToArticle(String newArticleText) {
    articleText.add(articleText.peekLast() + newArticleText);
  }

  void rewriteArticleText(String newArticleText) {
    articleText.add(newArticleText);
  }

  void printArticle() {
    System.out.println();
    System.out.println("============= Last version of article text =======================");
    System.out.println(articleText.peekLast());
    System.out.println("==================================================");
    System.out.println();
  }

  void removeLast() {
    articleText.remove(articleText.pollLast());
  }

  private Deque<String> getArticleTextHistory() {
    return articleText;
  }

  @Override
  public WikiPrototype clone() throws CloneNotSupportedException {
    return new WikiPrototype(new ArrayDeque<>(this.getArticleTextHistory()));
  }
}
