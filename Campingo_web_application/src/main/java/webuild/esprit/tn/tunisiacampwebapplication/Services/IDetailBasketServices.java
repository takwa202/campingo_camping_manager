package webuild.esprit.tn.tunisiacampwebapplication.Services;

import webuild.esprit.tn.tunisiacampwebapplication.Entities.DetailBasket;

import java.util.List;

public interface IDetailBasketServices {
    List<DetailBasket> retrieveAllDetailBasket();
    DetailBasket addDetailBasket (DetailBasket db);
    DetailBasket updateDetailBasket (DetailBasket db);
    DetailBasket retrieveDetailBasket (Integer idDetail);
    void deleteDetailBasket (Integer idDetail);
    public DetailBasket addDetailBasketToBasket(Integer idDetailBasket, Integer idBasket);
    public DetailBasket addDetailBasketToCommande(Integer idDetailBasket, Integer idCommande);
}
