package webuild.esprit.tn.tunisiacampwebapplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.DetailBasket;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.DetailBasketRepo;
import webuild.esprit.tn.tunisiacampwebapplication.Services.IDetailBasketServices;

import java.util.List;
@RestController
@RequestMapping("/AUTH/auth/DetailBasket")
public class DetailBasketController {
    @Autowired
    IDetailBasketServices detailBasketServices;
    @Autowired
    DetailBasketRepo detailBasketRepo;

    @GetMapping("/DetailBasketList")
    public List<DetailBasket> ListDetailBasket(){
        return detailBasketServices.retrieveAllDetailBasket();
    }
    @PostMapping("/addDetailBasket")
    @ResponseBody
    public DetailBasket addDetailBasket(@RequestBody DetailBasket db){
        return detailBasketServices.addDetailBasket(db);
    }
    @PutMapping("/UpdateDetailBasket/{idDetail}")
    public DetailBasket updateDetailBasket(@RequestBody DetailBasket db, @PathVariable Integer idDetail){
        return this.detailBasketRepo.findById(idDetail).map(x->{
            x.setNbrperPiece(db.getNbrperPiece());
            return detailBasketRepo.save(x);
        }).orElseGet(()->{
            db.setIdDetail(idDetail);
            return detailBasketRepo.save(db);
        });

    }
    @DeleteMapping("/DeleteDetailBasket/{idDetail}")
    public void deleteDetailBasket(@RequestBody DetailBasket db,@PathVariable Integer idDetail){
        detailBasketServices.deleteDetailBasket(idDetail);
    }

    @PutMapping("/addDetailBasketToBasket/{idDet}/{idBask}")
    public DetailBasket addDetailBasketToBasket(@PathVariable("idDet")Integer idDetailBasket,@PathVariable("idBask") Integer idBasket){
        return detailBasketServices.addDetailBasketToBasket(idBasket,idDetailBasket);

    }
    @PutMapping("/addDetailBasketToCommande/{idDet}/{idCom}")
    public DetailBasket addDetailBasketToCommande(@PathVariable("idDet")Integer idDetailBasket,@PathVariable("idCom") Integer idCommande){
        return detailBasketServices.addDetailBasketToCommande(idDetailBasket,idCommande);
    }
}
