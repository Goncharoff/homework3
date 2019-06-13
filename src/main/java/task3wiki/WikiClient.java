package task3wiki;

import java.util.Date;

public class WikiClient {

  public static void main(String[] args) throws CloneNotSupportedException {
    WikiPrototype javaArticle = new WikiPrototype("This is old  text for Java 1.5");


    System.out.println("init article");
    javaArticle.printArticle();
    System.out.println("new article -- text addition ");
    javaArticle.addTextToArticle(" Oh java 12 available!");
    javaArticle.printArticle();
    System.out.println("newer article -- all text changed");
    javaArticle.rewriteArticleText(" Under new license! =(");
    javaArticle.printArticle();

    System.out.println("after removing");
    javaArticle.removeLast();
    javaArticle.printArticle();

    System.out.println("Removing again!");
    javaArticle.removeLast();
    javaArticle.printArticle();

  }
}
