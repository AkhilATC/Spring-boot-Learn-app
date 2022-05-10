package learn.project.services;

import learn.project.models.db.Avengers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvengerService {

    @Autowired
    private AvengerServiceLayer avengerService;

    public Avengers addAvenger(Avengers avengers){
        Avengers addedAvegers = avengerService.insert(avengers);
        return addedAvegers;
    }
    public List<?> listAvengers(){
        System.out.println(avengerService.findAll());
        return avengerService.findAll();
    }
}
