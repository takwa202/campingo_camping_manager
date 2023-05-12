package webuild.esprit.tn.tunisiacampwebapplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Invoice;
import webuild.esprit.tn.tunisiacampwebapplication.Services.IInvoiceServices;

import java.util.List;
@RestController
@RequestMapping("/AUTH/auth/Invoice")
public class InvoiceController {
    @Autowired
    IInvoiceServices iInvoiceServices;

    @GetMapping("/InvoiceList")
    public List<Invoice> ListInvoice(){
        return iInvoiceServices.retrieveAllInvoice();
    }


}
