package webuild.esprit.tn.tunisiacampwebapplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Tools;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.ToolsRepo;
import webuild.esprit.tn.tunisiacampwebapplication.Services.IToolsServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/AUTH/auth/Tools")
public class ToolsController {
    @Autowired
    IToolsServices toolsServices;
    @Autowired
    ToolsRepo toolsRepo;
    @PostMapping("/addTools")
    @ResponseBody
    public void addTools(@RequestBody Tools tools){
        toolsServices.addTools(tools);
    }

    @GetMapping("/ToolsList")
    public List<Tools> ListTools(){
        return toolsServices.retrieveAllTools();
    }

    @PutMapping("/UpdateTools/{idTools}")
    public Tools updateTools(@RequestBody Tools t,@PathVariable Integer idTools){
        return this.toolsRepo.findById(idTools).map(y->{
            y.setType(t.getType());
            y.setBrand(t.getBrand());
            y.setPriceperUnit(t.getPriceperUnit());
            return toolsRepo.save(y);
        }).orElseGet(()->{
            t.setIdTools(idTools);
            return toolsRepo.save(t);
        });
    }

    @DeleteMapping("/DeleteTools/{idTools}")
    public void deleteTools(@RequestBody Tools t,@PathVariable Integer idTools){
        toolsServices.deleteTools(idTools);
    }

    @PutMapping("/addToolsToDetail/{idtools}/{idDet}")
    public Tools addToolsToDetailBasket(@PathVariable ("idtools") Integer idTools,@PathVariable("idDet") Integer idDetailBasket){
        return toolsServices.addToolsToDetailBasket(idTools, idDetailBasket);

    }

    @GetMapping("/quantity-and-price")
    public Map<String, Object> getQuantityAndTotalPrice(){
        List<Tools> tools = new ArrayList<>();
        return toolsServices.calculateQuantityAndTotalPrice(tools);
    }

    @GetMapping("/filter")
    public List<Tools> searchToolsByTypeAndBrand(@RequestParam(required = false) String type,@RequestParam(required = false) String brand){
        return toolsServices.searchToolsByTypeAndBrand(type, brand);
    }

}
