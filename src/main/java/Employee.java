/**
 * Created by alex on 2/13/2016.
 */
public class Employee {
    String name;
    String links;
    String title;
public Employee(String name, String links, String title){
    this.name = name;
    this.links=links;
    this.title=title;
}
    public String getName() {return name;
    }
    public String getImgPath(){return links;
    }
    public String getTitle() {return title;
    }
}
