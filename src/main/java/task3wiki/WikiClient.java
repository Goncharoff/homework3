package task3wiki;

import java.util.Date;

public class WikiClient {

  public static void main(String[] args) throws CloneNotSupportedException{
    WikiPrototype javaArticle = new WikiPrototype("This is old  text for Java 1.5", new Date().getTime());

    WikiPrototype newJavaArticle = javaArticle.clone();
    newJavaArticle.changeArticleText("Java 12 yeah!");

    WikiPrototype evenNewerJavaArticall = newJavaArticle.clone();
    evenNewerJavaArticall.changeArticleText("Java 12 is under new licence!");

    System.out.println("init article");
    javaArticle.printArticle();
    System.out.println("new article ");
    newJavaArticle.printArticle();
    System.out.println("newwest article");
    evenNewerJavaArticall.printArticle();
  }
}
