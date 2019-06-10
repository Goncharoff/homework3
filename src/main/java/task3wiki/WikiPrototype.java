package task3wiki;

import java.util.Date;

public class WikiPrototype implements Cloneable {
  private StringBuilder articleText;

  public WikiPrototype(String inputText, long timestamp) {
    articleText = new StringBuilder();
    articleText.append(inputText)
            .append(" with timestamp + " + timestamp);
  }

  private WikiPrototype(String savedArticleText) {
    articleText = new StringBuilder(savedArticleText);
  }

  public void changeArticleText(String newArticleText) {
    articleText.append(" + " + newArticleText);
  }

  public void printArticle() {
    System.out.println(articleText);
  }

  @Override
  public WikiPrototype clone() throws CloneNotSupportedException {
    return new WikiPrototype(this.articleText.toString());
  }
}
