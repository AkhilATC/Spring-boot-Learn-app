package learn.project.controllers;

import learn.project.models.db.Avengers;
import learn.project.services.AvengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarvelCU {

    @Autowired
    private AvengerService avengersAssemble;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addNew(@RequestBody Avengers avenger){
        System.out.println("here im");
        try{
            Avengers resp = avengersAssemble.addAvenger(avenger);
            return new ResponseEntity<>(resp, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllavengers(){
        List<?> resp = avengersAssemble.listAvengers();
        return new ResponseEntity<>(resp,HttpStatus.OK);
    }
    @GetMapping("/ping/{name}")
    public ResponseEntity<?> ping(@PathVariable String name){
        return new ResponseEntity<>("\uD83D\uDC4B Hello ".concat(name),HttpStatus.OK);
    }
}
