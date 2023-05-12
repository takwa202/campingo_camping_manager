package webuild.esprit.tn.tunisiacampwebapplication.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Basket;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Commande;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.DetailBasket;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Tools;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.BasketRepo;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.CommandeRepo;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.DetailBasketRepo;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.ToolsRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class DetailBasketServices implements IDetailBasketServices{
    @Autowired
    DetailBasketRepo detailBasketRepo;
    @Autowired
    BasketRepo basketRepo;
    @Autowired
    CommandeRepo commandeRepo;
    @Override
    public List<DetailBasket> retrieveAllDetailBasket() {
        return detailBasketRepo.findAll();
    }

    @Override
    public DetailBasket addDetailBasket(DetailBasket db) {
        return detailBasketRepo.save(db);
    }

    @Override
    public DetailBasket updateDetailBasket(DetailBasket db) {
        return detailBasketRepo.save(db);
    }

    @Override
    public DetailBasket retrieveDetailBasket(Integer idDetail) {
        return null;
    }

    @Override
    public void deleteDetailBasket(Integer idDetail) {
        detailBasketRepo.deleteById(idDetail);
    }

    @Override
    public DetailBasket addDetailBasketToBasket(Integer idDetailBasket, Integer idBasket) {
        DetailBasket detailBasket = detailBasketRepo.findById(idDetailBasket).orElse(null);
        Basket basket = basketRepo.findById(idBasket).orElse(null);
        detailBasket.setBasket(basket);
        return detailBasketRepo.save(detailBasket);

    }

    @Override
    public DetailBasket addDetailBasketToCommande(Integer idDetailBasket, Integer idCommande) {
        DetailBasket detailBasket = detailBasketRepo.findById(idDetailBasket).orElse(null);
        Commande commande = commandeRepo.findById(idCommande).orElse(null);
        detailBasket.setCommande(commande);
        return detailBasketRepo.save(detailBasket);
    }


}
