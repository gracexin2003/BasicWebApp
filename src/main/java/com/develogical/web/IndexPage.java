package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

    @Override
    protected void writeContentTo(PrintWriter writer) {
        writer.println(
                "<h1>Welcome! OWO </h1>" +
                "<p>o-o Enter your query in the box below ^-^: " +
                  "<form><input type=\"Enter text here :D\" name=\"q\" />" +
                    "<input type=\"submit\">" +
                  "</form>" +
                "</p>");
    }
    
}
