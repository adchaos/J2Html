import com.hp.gagawa.java.Node;
import com.hp.gagawa.java.elements.*;
import j2html.tags.Tag;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static j2html.TagCreator.*;
import static j2html.TagCreator.ul;

/**
 * Created by alex on 2/13/2016.
 */
public class MainView {


   public static void loadHtmlTemplate() throws IOException {
       File htmlTemplateFile = new File("C:\\Users\\alex\\Downloads\\shadowbox-gallery-source-codes - Copy\\index.html");
       String htmlString = FileUtils.readFileToString(htmlTemplateFile);
       String title = "<footer id=";
       MainView mainView = new MainView();
       String gallery =  mainView.html().toString();
       htmlString = htmlString.replace(title, gallery);
       //htmlString = htmlString.replace("$title", title);
       File newHtmlFile = new File("C:\\Users\\alex\\Downloads\\shadowbox-gallery-source-codes - Copy\\new.html");
       FileUtils.writeStringToFile(newHtmlFile, htmlString);
   }

    private static String html() {
        Div div = new Div();
        H1 h = new H1();
        h.appendText("Secondary Gallery").toString();

        div.setCSSClass("photos");

        Ul ul = new Ul();
        ul.setAttribute("class", "clearfix");
        Img img1 = new Img("first one", "images/photos-2nd/01-gas-heater-ios-app-icon-thumb.png").setHeight("200").setWidth("200");
        Img img2 = new Img("first one", "images/photos-2nd/02-movie-film-icon-app-thumb.png").setHeight("200").setWidth("200");
        Img img3 = new Img("first one","images/photos-2nd/03-dino-dominion-ios-app-thumb.png").setHeight("200").setWidth("200");
        Img img4 = new Img("first one","images/photos-2nd/04-photo-tagger-app-icon-thumb.png").setHeight("200").setWidth("200");
        Img img5 = new Img("first one","images/photos-2nd/05-air-hockey-app-icon-thumb.png").setHeight("200").setWidth("200");
        Img img6 = new Img("first one","images/photos-2nd/06-reading-rainbow-app-icon-thumb.png").setHeight("200").setWidth("200");

        A link = new A();
        List<Node> links  = new ArrayList<>();

        links.add(link.setHref("images/photos-2nd/01-gas-heater-ios-app-icon.png").setTarget("_blank").setRel("2ndlightbox").setTitle("Disgned by Alex").appendChild(img1));
        links.add(link.setHref("images/photos-2nd/02-movie-film-icon-app.png").setTarget("_blank").setRel("2ndlightbox").setTitle("Disgned by Alex").appendChild(img2));
        links.add(link.setHref("images/photos-2nd/03-dino-dominion-ios-app.png").setTarget("_blank").setRel("2ndlightbox").setTitle("Disgned by Alex").appendChild(img3));
        links.add(link.setHref("images/photos-2nd/04-photo-tagger-app-icon.png").setTarget("_blank").setRel("2ndlightbox").setTitle("Disgned by Alex").appendChild(img4));
        links.add(link.setHref("images/photos-2nd/05-air-hockey-app-icon.png").setTarget("_blank").setRel("2ndlightbox").setTitle("Disgned by Alex").appendChild(img5));
        links.add(link.setHref("images/photos-2nd/06-reading-rainbow-app-icon.png").setTarget("_blank").setRel("2ndlightbox").setTitle("Disgned by Alex").appendChild(img6));

        List<Node> lis = new ArrayList<>();
        for (Node image: links)
        {
            Li li = new Li();
            lis.add(li.appendChild(image));
        }
        ul.appendChild(lis);
        div.appendChild(ul);
        h.appendChild(div);
        //div.appendChild(link);
        h.appendChild(div);
        Img image = new Img("some alt", "some-image.png");
        image.setCSSClass("frame").setId("myimageid");
        link.appendChild(image);
        System.out.print(div.write());
        return div.write();
    }

  /*  public static String hmtl2() {
        Div div = new Div();
        div.setId("mydiv").setCSSClass("myclass");

        A link = new A();
        link.setHref("http://www.example.com").setTarget("_blank");

        div.appendChild(link);

        Img image = new Img("some alt", "some-image.png");
        image.setCSSClass("frame").setId("myimageid");
        link.appendChild(image);
        System.out.print(div.write());
        return div.write().toString();

    }*/






    public static Tag submitButton(String text) {
        return button().withType("submit").withText(text);
    }
    //create function for displaying employeesEnum (could also use regular for-loop)
   /* public static String render(String pageTitle, Tag... tags) {
        return html().with(
                head().with(
                        title(pageTitle)
                ),
                body().with(
                        header().with(),main().with(tags),footer().with()
                )
        ).render();
    }*/

    public static String htmlTemplate =
            "<html>" +
                    "<head>" +
                    "</head>" +
                    "<body>" +
                    "{0}" +
                    "</body>" +
                    "</html>";

    public static String imgTemplate = "<img src=" + "{0}" + " />";
    //private static List<Employee> employees;

    //create function for displaying employeesEnum (could also use regular for-loop)
    public static List<Tag> createEmployeeList(List<Employee> list) {
        return list.stream().map(employee ->
                div().withClass("employee").with(
                        h2(employee.getName()),
                        img().withSrc(employee.getImgPath()),
                        p(employee.getTitle())
                )
        ).collect(Collectors.toList());
    }
}
