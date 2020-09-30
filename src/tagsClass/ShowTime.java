package tagsClass;

import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;
import java.util.Date;

/**
 * Created by asus on 5/21/2020.
 */
public class ShowTime extends BodyTagSupport {

    @Override
    public int doStartTag(){


        try {
             pageContext.getOut().print(new Date().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }
}
