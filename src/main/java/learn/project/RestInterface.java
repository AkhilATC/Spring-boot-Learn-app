package learn.project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestInterface {

    @RequestMapping(value="/rest",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity responseRest(){
        KingResponseObject kingRespOb = new KingResponseObject("Mashkal soya",
                "Mishuth");
        return new ResponseEntity(kingRespOb, HttpStatus.OK);
    }
}
