package nvc.it.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ControllerTest1 {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "<center><h1>This root page <br><br> พัชรีภรณ์ ธีรศรัณยานนท์ <br> 63309010016</h1></center> <br> <a href='/name'>Go to name page</a>";
    }

    @RequestMapping("/name")
    @ResponseBody
    public String name(){
        return "<center><h1>Patchareeporn T.</h1></center> <br> <a href='/'>Back to home page</a>";
    }

    @RequestMapping("/aboutme")
    @ResponseBody
    public String aboutme(){
        return "<center><h1>About Me</h1> <hr><br> Name : Patchareeporn Theerasarunyanon <br> NickName : Mild <br> Age : 19 year</center>";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String contact(){
        return "<center><h1>Contact</h1> <hr><br> Facebook : พัชรีภรณ์ ธีรศรัณยานนท์ <br> Line : mildsas44 <br> instagram : pcrpm.m <br> Tel : 0844576833 </center>";
    }
}
